// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		if (hours<=12) {
			System.out.print(hours+":");
		}
		else{
			System.out.print("0"+(hours-12)+":");
		}

		if (minutes>9) {
			System.out.print(minutes);
		}
		else{
			System.out.print("0"+minutes);
		}
		if (hours<12) {
			System.out.print(" AM");
			
		} else{
			System.out.print(" PM");
		}
	}
}