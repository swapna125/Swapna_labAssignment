/** Author:Swapna
 * desc:validate the age of a person and throw an exception
 * age of a person should be above 15
 */
package lab5;

import java.util.Scanner;

public class AgeException{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");//user input
		int age = sc.nextInt();
		sc.close();//scanner class
		try {
			/**check the age of a person if it is below 15 then throw an exception 
			 * otherwise it print person's age
			 */
			if (age <= 15)
				throw new InvalidAgeException("Invalid age");//throw the exception
			else
				System.out.println("your Age is:" + age);
		} catch (InvalidAgeException e) {//handling the exception
			System.out.println(e.getMessage());
		}
	}
}

