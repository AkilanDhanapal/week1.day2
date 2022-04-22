package Fibonacci;

public class fiboanacci_range8 {
	public static void main(String[] args) {
		int firstNum = 0, secNum = 1, range =8, sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i=1; i<=6; i++)
		{
		sum = firstNum + secNum;
		System.out.println(sum);
		
		firstNum = secNum;
		secNum = sum;
		}
	}

}
