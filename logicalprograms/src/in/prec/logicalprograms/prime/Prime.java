package in.prec.logicalprograms.prime;

public class Prime {
	int number;
public Prime(int number){
this.number=number;	
}
public void setNumber(int number){
	this.number=number;
}
public boolean isPrime() {
	for(int i=2;i*i<=number;i++) {
		if(number%i==0) {
			return false;
		}
	}
	return true;
}
}
