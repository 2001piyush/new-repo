package in.prec.logicalprograms.reversenumber.main;
import in.prec.logicalprograms.reversenumber.Reversenumber;
public class ReversenumberMain {
public static void main(String args[]) {
	Reversenumber reverse=new Reversenumber(121);
	System.out.println(reverse.printreverse());
	System.out.println(reverse.isPallendrome()); 
}
}
