package in.prec.logicalprograms.mainreversestring;
import in.prec.logicalprograms.reversestring.ReverseString;
import java.util.Scanner;
public class MainReverseString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter name to reverse");
	String temp=scanner.nextLine();
	
	scanner.close();
	ReverseString reversestring=new ReverseString();
	reversestring.steVariable(temp);
	String result=reversestring.reverseStringLine();
	System.out.println(result);
}

}
