/**  Author name :SWAPNA
     date: 23/10/2020
     desc: testing compliation and running to find the second smallest element in the array
*/
import java.util.Arrays;
import java.util.Scanner;
public class SecondNum {
	public int getSecondSmallest(int a[])
	{
		Arrays.sort(a);//sorting an array
		return a[1];//returning second element 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//taking input
		SecondNum m= new SecondNum();
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(m.getSecondSmallest(arr));//displaying result
	}
		}