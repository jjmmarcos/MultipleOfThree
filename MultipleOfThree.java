import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
	int three = 3;

	Scanner sn = new Scanner(System.in);
	System.out.println("Write a number: ");
	int number = sn.nextInt();

	String mssg = (number%three == 0) ? " is multiple of three" : " is not multiple of three";

	System.out.println(number + mssg);

	}

}
