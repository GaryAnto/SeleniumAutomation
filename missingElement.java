import java.util.Arrays;

public class missingElement {
	public static void main(String[] args) {
		/*	int[] a= {1,2,3,4,6,7,8};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {      //finding one missing number
			if (i+1!=a[i]) {
				System.out.println(i+1);
				break;
			}*/
		
			int[] b= {12,14,15,14,12,20,18,20,18,19};
			
			for (int j = 0; j < b.length; j++) {     //finding duplicate number
				int count=1;
				for (int k = j+1; k < b.length; k++) {
					if (b[j]==b[k]) {
						count++;
										
					}
					
				}
				if (count>1) {
					System.out.println(b[j]);
					
					
				}
			}
		
				}

	}





