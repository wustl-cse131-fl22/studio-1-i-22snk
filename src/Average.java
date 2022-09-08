import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First integer"); 
		int n1 = in.nextInt();
		System.out.println("Second Integer"); 
		int n2 = in.nextInt();
		double sum = n1 + n2; 
		double quot = sum/2; 
		System.out.println("The average of the inputs in " + quot + "."); 

	}

}
