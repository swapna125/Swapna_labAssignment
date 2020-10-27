

/**  Author name :SWAPNA
     date: 23/10/2020
     desc: testing compliation and running to sort string and convert to upper and lower cases 
*/

import java.util.*;

public class SortStrings {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	     System.out.println("Enter the String");
	     String str=sc.next();
	     char [] result=str.toCharArray();
		 String str1=sortString(result);
		 
		System.out.println("Alphabetically sorted order is "+str1);
		int len=str1.length();
		//if length is even
		String res1=" ";
		String res2=" ";
		int mid;
		if(len%2==0)//if length is even
		{
			mid=len/2;
			res1=str1.substring(0,mid); 
		    res2=str1.substring(mid);
		}
	    else    //if length is odd
	    {
	    	mid=(len/2)+1;
	    	res1=str1.substring(0,mid);
	        res2=str1.substring(mid);
	    	
	    }
		System.out.println("The Resultant String is" +res1.toUpperCase()+res2.toLowerCase());
		
		 
	}
	public static String sortString(char str[])
	{
		
		char temp;
    	for(int i=0;i<str.length;i++)
    	{
    		for(int j=i+1;j<str.length;j++)
    		{
    			if(str[i]>(str[j]))
    			{
    				temp=str[i];
    				str[i]=str[j];
    				str[j]=temp;
    			}
    		}
    	}
    	String str2=String.valueOf(str);
    	return str2;
    	
    	
	}
}

