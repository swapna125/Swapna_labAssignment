
/**
 * array of integer elements and return the second smallest element in the array
 */
import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		/**
		 * insert element in an numArray call the getSecondSmallestElement display
		 * second smallest element
		 */
		Integer numArray[] = { 97,45,12,345,455,23 };
		int secondSmallestElement = getSecondSmallest(numArray);
		System.out.println("Second Smallest element is : " + secondSmallestElement);
	}

	private static int getSecondSmallest(Integer[] numArray) {
		/**
		 * insert array elemet in a list
		 */
		List<Integer> element = Arrays.asList(numArray);
		// soting array
		Collections.sort(element);
		/**
		 * display sorting element and get second element
		 */
		System.out.println("Sorting Array\n" + element);
		Integer secondSmallest = element.get(1);
		return secondSmallest;
	}

}

