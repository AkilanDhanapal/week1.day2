package week1.day2;

public class MissingElementsInAnArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		for(int i=1; i<=arr.length;i++)
		{
			if(arr[i-1]!=i) {
				System.out.println("Missing Number is "+i);
			}
		}
	}

}
