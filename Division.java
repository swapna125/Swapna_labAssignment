package labAssignment;
import java.util.Scanner;

public class Division {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		System.out.println(calculateSum(v));
	}

	public static int calculateSum(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0 || i % 3 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
