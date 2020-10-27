/**  Author name :SWAPNA
     date: 23/10/2020
     desc: testing compliation and running to remove all the duplicates and printing resulting array in descending order 
*/
import java.util.*;
public class Duplicates{
public static int modifyarray(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
         }
        temp[j++] = arr[n-1];  
       
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
     
    public static void main (String[] args) {
    int size;
System.out.println("Enter the size of array:");
Scanner sc=new Scanner(System.in);
    size=sc.nextInt();//storing arry
    int arr[] =new int[size];
    System.out.println("Enter the elements:");
    for(int j=0;j<size;j++){
    int num=sc.nextInt();
        arr[j]=num;
        }
        Arrays.sort(arr);
        int length = arr.length;
        length = modifyarray(arr, length);
       
        for (int i=length-1; i>=0; i--)
           System.out.print(arr[i]+" ");//displaying resultant array
    }
}
