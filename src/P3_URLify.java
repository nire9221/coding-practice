// Write a method to replace all spaces in a string with %20 
// 

public class P3_URLify {


	public String replace(String str) {
	    String[] words = str.split(" ");
	    StringBuilder sentence = new StringBuilder(words[0]);

	    for (int i = 1; i < words.length; ++i) {
	        sentence.append("%20");
	        sentence.append(words[i]);
	    }

	    return sentence.toString();
	}
}
