/* * Author:Swapna
 * Description:check the salary of an employee is below 3000 or not and then throw exception
 */
package com.cg.eis.exception;
import java.util.Scanner;
public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int salary=sc.nextInt();//Taking user input
      sc.close();//Scanner close
      try//try and catch implementation
      {
    	  if(salary<3000) //Checking the salary condition
    	  {
    		  throw new MyException("salary must be greater then 3000");
      }
      }
      catch(MyException e)//handling the exception
      {
    	  System.out.println(e.getMessage());//Printing the Exception
      }
      
	}
	}
	class MyException extends Exception
	{
		public MyException()
		{
			super();//acquring the methods of parent class
		}
		public MyException(String msg) {
			super(msg);
		}
	}

