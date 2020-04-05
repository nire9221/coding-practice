// Given 2 strings, write a method to decide if one is a permutation of the others   ex) dog <-> god 
// check case sensitive, white space is significant 

public class P2_permutation {

	
	public boolean permutation(String s, String t) {
		if (s.length() != t.length()) { // permutations must be same length
			return false;
		}
		
		int[] letters = new int [128]; // assumtion : ASCII
		for (int i= 0;  i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		
		for (int i=0; i<t.length(); i++) {
			letters[t.charAt(i)]--;
			if(letters[t.charAt(i)] < 0) {
				return false;
			}
		}
		return true; // letters has no neg values, therefore no pos value either
	}

}
