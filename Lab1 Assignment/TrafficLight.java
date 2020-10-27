package labAssignment;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String Choice=sc.next();
		if(Choice.equals("red"))
		{
		 System.out.println("stop");	
		}
	else if(Choice.equals("yellow"))
		{
			System.out.println("ready");
		}
		else 
		{
			System.out.println("Go");
		}

	}

}



