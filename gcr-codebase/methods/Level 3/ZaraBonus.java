import java.util.*;
public class ZaraBonus{
	public static void main(String[] args){
	
		double salary[][] = generateSalary();
		
		for(int i=0;i<10;i++)
			System.out.println("Employee salary: "+salary[i][0]+", total service year "+salary[i][1]);
		
		double newSalary[][] = newSalaryBonus(salary);
		for(int i=0;i<10;i++)
			System.out.println("Employee new salary: "+newSalary[i][0]+", total bonus "+newSalary[i][1]);
		
		double total[] = totalSalary(salary, newSalary);
		System.out.println("Total salary: "+total[0]);
		System.out.println("Total new salary: "+total[1]);
		System.out.println("Total Bonus: "+total[2]);
		
	}
	
	//Method to determine the Salary and years of service
	public static double[][] generateSalary(){
		double salary[][] = new double[10][2];
		
		for(int i=0;i<10;i++){
			salary[i][0] = (Math.random()*99999 +10000);
			salary[i][1] = (int)(Math.random()*10+1);
		}
		return salary;
	}
	
	// Method to calculate the new salary and bonus
	public static double[][] newSalaryBonus(double salary[][]){
		double newSalary[][] = new double[10][2];
		
		for(int i=0;i<10;i++){
			if(salary[i][1]>=5){
				double bonus = salary[i][0]*0.05;
				newSalary[i][1] = bonus;
				newSalary[i][0] = salary[i][0]+bonus;
			}
			else{
				double bonus = salary[i][0]*0.02;
				newSalary[i][1] = bonus;
				newSalary[i][0] = salary[i][0]+bonus;
			}
		}
		return newSalary;
	}
	
	//Method to Calculate the sum of the Old Salary, the Sum of the New Salary
	public static double[] totalSalary(double oldSalary[][], double newSalary[][]){
		double oldTotal = 0;
		double totalBonus = 0;
		double newSalaryTotal =0;
		
		for(int i=0;i<oldSalary.length;i++){
			oldTotal += oldSalary[i][0];
			totalBonus = newSalary[i][1];
			newSalaryTotal = newSalary[i][0];
		}
		double arr[] = {oldTotal, newSalaryTotal, totalBonus};
		return arr;
	}
}