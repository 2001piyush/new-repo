package in.prec.logicalprograms.reversenumber;

public class Reversenumber {
	int number;
	int result=0;
	int checknumber;
public Reversenumber(int number) {
	this.number=number;
	this.checknumber=number;
	
}
int givennumber=number;
public int printreverse() {
	while(number!=0) {
		int digit=number%10;
		number/=10;
		result=result*10+digit;
		
	}
	return result;
}
public boolean isPallendrome() {
	return checknumber==result;
}
 
}
