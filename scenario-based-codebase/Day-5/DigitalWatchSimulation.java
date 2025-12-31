/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatchSimulation {
	public static void main(String args[]){
		// Simulate a 24-hour watch
		for(int hour=0;hour<24;hour++){
			
			for(int minute = 0;minute<60;minute++){
				if(hour==13 && minute==1){
					System.out.println("\n⚠️ Power Cut! Watch stopped at 13:00");
					break;
				}
				if(hour<10){
					if(minute<10)
						System.out.println("Time: 0"+hour+" : 0"+minute);
					else
						System.out.println("Time: 0"+hour+" : "+minute);
				}
				else{
					if(minute<10)
						System.out.println("Time: "+hour+" : 0"+minute);
					else
						System.out.println("Time: "+hour+" : "+minute);
				}
			}
			if(hour==13)
				break;
		}
	}
}