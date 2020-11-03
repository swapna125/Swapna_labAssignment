/** Author:Swapna
 * desc:validate the age of a person and throw an exception
 * age of a person should be above 15
 */
package lab5;
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();//acquring the parent class methods
	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}

