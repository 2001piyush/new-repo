package in.prec.logicalprograms.maintest;
import in.prec.logicalprograms.series.series;
import java.util.Scanner;

public class MainTest {
public static void main(String[] args) {
	series series=new series();
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	series.setLimit(limit);
//	series.printFibonacci();
	series.printCubeSquareSeries();
}
}
