

public class palindrome1 {

	public static void main(String[] args) {
		String Pname="Gary";
		String rev="";
		for (int i= Pname.length()-1 ; i>=0; i--) {
			rev=rev+Pname.charAt(i);
			System.out.println(rev);
		}
		if(Pname.equals(rev)) {
			System.out.println("given word is palindrome");
		}else {
			System.out.println("given word is not palindrome");
		}
	}

}
