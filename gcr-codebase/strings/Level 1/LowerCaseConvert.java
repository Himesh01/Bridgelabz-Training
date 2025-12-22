import java.util.*;
public class LowerCaseConvert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s+" converted to in manual way  "+toLower(s));
		System.out.println(s+" converted to in built in way  "+s.toLowerCase());
	}
	public static String toLower(String s){
		String str ="";
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)==' '){
				str+=""+s.charAt(i);
			}else{
				int a = (int)s.charAt(i);
				if(a<97){
					char n = (char)(a+32);
					str+=""+n;
				}else{
					str+=(char)a;
				}
			}
		}
		return str;
	}
}