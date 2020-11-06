import java.util.*;

/**
 * 
 * Author: Swapna
 * Desc:Reverse the elements in the array and print the sorted array
 *
 */
public class SortReverseNumber {
	public static void main(String[] args) {
		/**
		 * inserting element in list
		 * call the getSorted() function
		 * and displaying Sorted reverse array
		 */
		List<Integer> result=new ArrayList<>(Arrays.asList(34,98,76,12,45));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array\n "+reverse);
	}
	
	private static List<Integer> getSorted(List<Integer> result) {
		
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		/**
		 * displaying reverse array using reverse() method
		 */
		Collections.reverse(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array\n "+reverseSorted);
		 /**
		  * sorting the reverse array and displaying them
		  */
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;
	}

	
	

}
