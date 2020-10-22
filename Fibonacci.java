package labAssignment;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int a=1,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of values");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("The nth value in fibonocci series for n values is "+c);
		
		

	}

}


