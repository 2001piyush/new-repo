package in.prec.logicalprograms.perfectnumber;

public class PerfectNumber {
	int number;
public PerfectNumber(int number){
	this.number=number;
}

public boolean isPerfect() {
	int temp=number;
	if(number<=1) {
		return false;
	}
	else {
		int sum=0;
		for(int i=1;i<=temp/2;i++) {
			if(temp%i==0) {
				sum+=i;
			}
		}
		return sum==number;
	}
	
}
}
