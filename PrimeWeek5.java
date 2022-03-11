package coding;
import java.util.Scanner;
public class PrimeWeek5 {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		for (int k = 0; k<100; k++) {
			
		System.out.print("start");
		int a=in.nextInt();
		System.out.print("End ");
		int b=in.nextInt();
		for (int j = a;j<=b; j++) {
			
			int num = j;
			int count=0;
			for (int i = 1; i <=num; i++) {
				
				if (num%i==0){
				count++;
			}
			}
			if (count==2) {
		System.out.print(" "+num);
			}
			}
		System.out.println(" ");
		}

			
	}
	} 

