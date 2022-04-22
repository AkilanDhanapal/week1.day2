package prime;

public class Prime_r_Not {
	public static void main(String[] args) {
		int remainder=0,number=5;
		for(int i=2;i<=number/2; i++) {
			remainder=number%i;
		}
			if (remainder==0)
			{
				System.out.println("The given number is not prime");
				
			}
			else
			{
			System.out.println("The given number is prime");
			}
		
	}

}
