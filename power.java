package labAssignment;
import java.util.Scanner;
public class power {
public static boolean checkNumber(int n)
{
	while(n!=1)
	{
		if(n%2!=0)
		{
			return false;
		}
		n=n/2;
	}
	return true;
}
public static void main(String args[]) {
	power src=new power();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(src.checkNumber(n));
}
}
