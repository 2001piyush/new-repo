package in.prec.logicalprograms.presentation;
import java.util.Scanner;
public class Helper {
public int printMenue(Scanner scanner) {
	System.out.println("1 to check number is pallendrome");
	System.out.println("2 to check number is armstrong");
	System.out.println("3 to check number is perfeect");
	System.out.println("4 to check number is prime");
	return scanner.nextInt();
}
}
