package bwise;
import java.util.Scanner;
public class bwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("bitwise test even or odd\n");
	for(;;) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter your number\n");
		int num = scan.nextInt();


		if((num & 1)==0)
		System.out.print("\nEven\n");
		else
			System.out.print("\nOdd\n");
	}
	}

}
