package project4;

public class String2 {
	String a="GARY";
	String b="mass";
	String r="rodriguez";
public static void main(String[] args) {
	String2 name=new String2();
	System.out.println(name.r);
	String str3=new String("CAR");
	String str4=new String("mass");
	int length = str3.length();
	System.out.println(length);
	char[] charArray = str3.toCharArray();
  System.out.println(charArray);
  System.out.println(str3.charAt(0));
  System.out.println(str4.contains(""));
  System.out.println(str3.indexOf("a"));
  System.out.println(name.b.equalsIgnoreCase(str4));
  System.out.println(str3==str4);
  System.out.println(name.a.toLowerCase());
  System.out.println(str4.toUpperCase());
			}
}
