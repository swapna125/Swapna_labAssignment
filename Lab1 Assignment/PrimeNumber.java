package labAssignment;

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value");
     int n=sc.nextInt();
     System.out.println("The prime numbers are:");
     
     for(int i=1;i<=n;i++) 
     {
    	 int count=0;
    	for(int j=1;j<=i;j++)
    	{
    	if(i%j==0)
    	  count++;
    	}
    	if(count==2)
    		System.out.println(i);
     
     }
	}

}
