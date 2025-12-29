/*. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.*;

public class StudentsAttendance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String stu[] = {"Nageshwar", "Lucky", "Himesh", "Jay", "Raj", "Nilesh", "Nitin", "Rajeev", "Manish", "Prashant"};
		
		int present = 0;
		int absent = 0;
		
		System.out.println("Enter P if present");
		System.out.println("Enter A if absent"); 
		for(String s: stu){
			System.out.print(s+" : ");
			char isPre =sc.next().charAt(0);
			
			if(isPre=='p' || isPre =='P')
				present+=1;
			else
				absent+=1;
		}
		
		System.out.println("Present students: "+present);
		System.out.println("Absent students: "+absent);
	}
}