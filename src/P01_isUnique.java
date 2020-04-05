//Implement an algorithm to determine if a string has all unique character 

public class P01_isUnique {

	
	public boolean isUnique(String str) {
		if (str.length() >128 ) {
			return false;
		}
		
		boolean[] charSet = new boolean[128];
		for (int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val]) {
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}

}
