import java.util.*;

public class StringOutOfBound{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		try{
			customException();
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception found: "+e.toString());
		}
	}
	
	//Method to demonstrate StringIndexOutOfBoundsException
	public static void customException() throws StringIndexOutOfBoundsException{
		String s = "Himesh";
		System.out.println(s.charAt(s.length()));
	}
}