
public class Sports {
	public void Achiever(String name, int medalCount) {
		System.out.println(name+" "+medalCount);
	}
	     public void Achiever(String country, String sportName ,int rank) {
	    	 System.out.println(country+" "+sportName+" "+rank);
	     }
         public void Achiever(float weight, int height , long contactNumber) {
			System.out.println(weight+" "+height+" "+contactNumber);
		}
           public void Achiever(String tournamentName, long prizeMoney) {
        	   System.out.println(tournamentName+" "+prizeMoney);
			
		}
           public static void main(String[] args) {
			Sports Athelete=new Sports();
			Athelete.Achiever("Gary.A", 7);
			Athelete.Achiever("WorldChampionship", 25000);
			Athelete.Achiever(75.5F, 175, 636939027);
			Athelete.Achiever("India", "Cricket", 7);
			
			
					
					
		}
}
