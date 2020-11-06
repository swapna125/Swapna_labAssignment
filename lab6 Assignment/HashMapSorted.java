/**
 * hash map and return the values of the map in sorted order as a List.
 */
import java.util.*;

public class HashMapSorted {
	public static void main(String[] args) {
		/**
		 * HashMap declare and add value using put function
		 */
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "manoj");
		hashMap.put(2, "raju");
		hashMap.put(3, "aishwarya");
		hashMap.put(4, "sushanth");
		/**
		 * create list variable and call the getValues() function
		 */
		List<String> sortedHashMap = new ArrayList<String>();
		sortedHashMap = getValues(hashMap);
		/**
		 * print sorted hashMap data
		 */
		System.out.println(sortedHashMap);

	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {

		List<String> sortedHashMap = new ArrayList<String>();
		/**
		 * add all value in the list
		 */
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		/**
		 * sorting list
		 */
		Collections.sort(sortedHashMap);

		return sortedHashMap;
	}

}

