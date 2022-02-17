public class ReverseEvenWords {
public static void main(String[] args) {
	
	/*
	 * String a="i am human being"; //I ma human gnieb String[] words =
	 * a.split(" "); for (int i = 0; i < words.length; i++) {
	 * System.out.print(words[i]+ " "); }
	 */
	 
	String b="i am human being"; //I ma human gnieb
	String[] word = b.split(" ");
	for (int j = 0; j < word.length; j++) {
		if(j % 2 == 1) {
			for (int k = word[j].length()-1 ; k >= 0; k--) {
				System.out.print(word[j].charAt(k));
			}
			System.out.print(" ");
			
		}else {
			System.out.print(word[j]+" ");
		}
		
	}
	
	
}
}
