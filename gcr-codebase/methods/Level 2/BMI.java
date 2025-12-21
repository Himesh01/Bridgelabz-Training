import java.util.*;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float[]weight = new float[10];
		float[]height = new float[10];
		
		for(int i =0;i<10;i++){
			System.out.println("Enter the weight:");
			weight[i] = sc.nextFloat();
			System.out.println("Enter the height:");
			height[i] = sc.nextFloat();
		}
		float [] bmi = bmiCheck(weight,height);
		for(int i =0;i<bmi.length;i++){
			if(bmi[i]<=18.4){
				System.out.println("UnderWeight");
			}
			else if(bmi[i]>=18.5&&bmi[i]<=24.9){
				System.out.println("Normal");
			}
			else if(bmi[i]>=25.0&&bmi[i]<=39.9){
				System.out.println("OverWeight");
			}else{
				System.out.println("Obese");
			}
		}
	}
	public static float[] bmiCheck(float[] w, float[]h){
		float [] bmi = new float[10];
		for(int i =0;i<10;i++){
			bmi[i]= w[i]/(h[i]*h[i]);
		}
		return bmi;
	}
}