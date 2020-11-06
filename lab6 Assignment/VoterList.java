
/**
 * Author:Swapna
 * Desc:accepts the id and the age of people as a Map and decide if they are eligible for vote. 
 * A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list. 
 */
import java.util.*;

public class VoterList {
	public static void main(String[] args) {
		/**
		 * insert all value in map
		 * and call voterList () function
		 * and display detail
		 */
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		voterList.put(101, 25);
		voterList.put(102, 17);
		voterList.put(103, 16);
		voterList.put(104, 52);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		/**
		 * check the age is grater than 18 or not
		 * if age is more than 18 then display registration number
		 * otherwise registration number not show
		 */
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}

