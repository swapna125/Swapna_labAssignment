/**  Author name :SWAPNA
     date: 23/10/2020
     desc: testing compliation and running to reverse numbers in the array and displaying sorted array
*/
import java.util.Scanner;
import java.util.Arrays;
public class reverse {

    static void getSorted(int arr[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }

        System.out.println("Reversed sorted array is: \n");//printing the sorted array
        Arrays.sort(b);
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args)
    {
        int size;

        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter the elements:");

        for(int j=0;j<size;j++){
            int num=sc.nextInt();
            arr[j]=num;//storing input in an array
        }
        getSorted(arr, arr.length);//sorting array
    }
}
