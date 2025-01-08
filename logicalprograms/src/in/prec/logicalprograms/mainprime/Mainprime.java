package in.prec.logicalprograms.mainprime;
import java.util.Scanner;
 import in.prec.logicalprograms.prime.Prime;
public class Mainprime {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("enter number");
		int number=scanner.nextInt();
		Prime testnumber=new Prime(number);
		boolean isPrime=testnumber.isPrime();
        System.out.println(isPrime);
      
	}

}
