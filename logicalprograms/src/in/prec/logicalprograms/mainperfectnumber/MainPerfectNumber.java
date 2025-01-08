package in.prec.logicalprograms.mainperfectnumber;
import java.util.Scanner;
import in.prec.logicalprograms.perfectnumber.PerfectNumber;
public class MainPerfectNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("enter number");
		int number=scanner.nextInt();
		PerfectNumber testnumber=new PerfectNumber(number);
		boolean isPerfect=testnumber.isPerfect();
        System.out.println(isPerfect);
        
	}
}
