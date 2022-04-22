package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int sum=obj.add(4, 5, 6);
		System.out.println("      Calculator Results\n");
		System.out.println("Sum is "+sum+"\n");
		int subract=obj.sub(4, 5);
		System.out.println("Subraction is "+subract+"\n");
		double multiply=obj.mul(4, 5);
		System.out.println("Multiple is "+multiply+"\n");
		float divide1=obj.divide(10, 5);
		System.out.println("Divide is "+divide1+"\n");
		
		
		
		
		
	}

}
class Calculator
{
	int add(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
	int sub(int num1, int num2)
	{
		return num1-num2;
	}
	double mul (double num1, double num2)
	{
		return num1*num2;
	}
	float divide(float num1, float num2)
	{
		return num1/num2;
	}
}