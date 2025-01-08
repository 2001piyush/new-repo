package in.prec.logicalprograms.menudriver;
import java.util.Scanner;
import in.prec.logicalprograms.presentation.Helper;
 public class MenuDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Helper helper=new Helper();
		helper.printMenue(scanner);
		int option=0;
		do {
			switch(option) {
			case 1:helper.checkPallendrome(Scanner);
			       break;
			case 2:helper.checkArmtrong(Scanner);
		       break;
			case 3:helper.checkPerfect(Scanner);
		       break;
			case 4:helper.checkPrime(Scanner);
		       break;
		    default:System.out.println("invalid input");
			}
		}
		while(option!=0)
      
	}

}
