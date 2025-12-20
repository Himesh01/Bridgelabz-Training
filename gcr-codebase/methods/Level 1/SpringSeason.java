import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {
   
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		if(isSpring(d,m)){
			System.out.println("It is a Spring Season "+d+" / "+m);
		}else{
			System.out.println("It is not a Spring Season "+d+" / "+m);
		}
	}
	public static boolean isSpring(int d , int m ){
		if((m==3&&d>=20)||(m==6&&d<=20)||(m>3&&m<6)){
			return true;
		}
		return false;
	}
}