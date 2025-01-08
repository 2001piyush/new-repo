package in.prec.logicalprograms.series;

public class series {
int limit;
public series() {
	
}
public void setLimit(int limit) {
	this.limit=limit;
}
public void printFibonacci() {
	System.out.print(" 0 1");
	int number1=0;
	int number2=1;
	int sum=0;
	for(int i=0;i<limit-2;i++) {
	sum=number1+number2;
	number1=number2;
	number2=sum;
	System.out.print(" "+sum+" ");
	}
}
public void printCubeSquareSeries() {
	for(int i=1;i<=limit;i++) {
		if(i%2==0) {
			System.out.print(" "+i*i+" ");
		}
		else {
			System.out.print(" "+i*i*i+" ");

		}
	}
}
public void pyramid() {
	for(int i=1;i<=limit;i++) {
		for(int j=1;j<=i;j++) {
			if(i%2==0) {
				System.out.print(" "+i*i+" ");
			}
			else {
				System.out.print(" "+i*i*i+" ");

			}
		}
	}
}
public void printseries() {
	
}
}
