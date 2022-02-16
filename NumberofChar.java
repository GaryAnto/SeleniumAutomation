
public class NumberofChar {
	public static void main(String[] args) {
		String a = "welcome to home";                   
	int count=0;
     for (int i = 0; i < a.length() ; i++) {     
        	 if (a.charAt(i)=='e') {
        	 count++;	
		} 
		}
       System.out.println(count);
		
			String b= "welcome to home";
		String c = b.replace("e","");
		System.out.println(b.length()-c.length()); 
	}

}
