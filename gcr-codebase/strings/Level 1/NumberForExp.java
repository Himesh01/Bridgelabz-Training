import java.util.*;

public class NumberForExp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st = sc.next();
		try{
			raiseException(st);
		}
		catch(NumberFormatException e){
			System.out.println("Exception occured: "+e.toString());
		}
	}
	public static int raiseException(String s) throws NumberFormatException{
		int x = Integer.parseInt(s);
		return x;
	}
}