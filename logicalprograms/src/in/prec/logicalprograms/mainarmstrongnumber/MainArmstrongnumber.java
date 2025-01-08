package in.prec.logicalprograms.mainarmstrongnumber;
import java.util.Scanner;
import in.prec.logicalprograms.armstrongnumber.ArmstrongNumber;
public class MainArmstrongnumber {
	ArmstrongNumber testnumber=new ArmstrongNumber(123);
	boolean isArm=testnumber.isArmstrong();
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("enter number");
		int number=scanner.nextInt();
		ArmstrongNumber testnumber=new ArmstrongNumber(number);
		boolean isArm=testnumber.isArmstrong();
        System.out.println(isArm);
        
	}
}
