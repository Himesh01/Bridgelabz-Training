import java.util.*;

public class DisplayCalendar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		displayCalendar(month,year);
				
	}
	// Method to get the name of the month
	public static String getMonthName(int month){
		String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		return months[month-1];
	}
	
	// Method to get the number of days in the month
	public static int getMonthDay(int year, int month){
		int days[] = {31,28, 31,30,31,30,31,31,30,31,30,31};
		
		if(isLeapYear(year))
			return 29;
		return days[month-1];
	}
	
	//Write a method to get the first day of the month using the Gregorian calendar algorithm
	public static int getFirstDay(int d, int m, int y){
		int y0= y - (14-m)/12;
		int x = y0+ y0/4 - y0/100 + y0/400;
		int m0 = m+12*((14-m)/12)-2;
		int d0 = (d+x+ 31*m0/12) %7;
		
		return d0;
	}
	
	//Leap Year Method
	public static boolean isLeapYear(int year){
		
			if((year%400==0 || (year%4==0 && year%100!=0)))
				return true;
			else
				return false;
		
	}
	
	//Displaying the Calendar
	public static void displayCalendar(int month, int year){
		int firstDay = getFirstDay(1, month, year);
		int totalDays =  getMonthDay(year, month);
		
		System.out.println(getMonthName(month)+" "+year);
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		
		for(int i=0;i<firstDay;i++){
			System.out.print("    ");
		}
		
		for(int i=1;i<=totalDays;i++){
			if(i/10>=1)
				System.out.print(" ");
			else
				System.out.print("  ");
			System.out.print(i+" ");
			if(firstDay%7==6)
				System.out.println();
			firstDay++;
		}
	}
}