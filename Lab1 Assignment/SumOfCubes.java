package labAssignment;

public class SumOfCubes {
	static int sum=0,lastDigit;
	public static void main(String[] args) {
		//enter number
		//calculate sum
		//display result
		//System.out.println("Enter the number");
		int number=1234;
		CubeSum(number);
		System.out.println("Sum of cubes of this number :" +sum);
	}
	private static int CubeSum(int number){
		
		while(number>0)
		{
			
			lastDigit=number%10;
			sum=lastDigit*lastDigit*lastDigit+sum;
			number=number/10;
		}
		return sum;
	}
}