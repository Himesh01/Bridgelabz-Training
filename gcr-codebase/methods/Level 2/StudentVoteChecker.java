import java.util.*;
public class StudentVoteChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		
		int [] age = new int[10];
		for(int i =0;i<10;i++){
			age[i] = sc.nextInt();
		}
		
		for(int a: age){
			if(canStudentVote(a)){
				System.out.println("The student can vote");
			}else{
				System.out.println("The student can not vote");
			}
		}
	}
	public static boolean canStudentVote(int age){
		if(age>=18){
			return true;
		}
		return false;
	}
}