package in.prec.logicalprograms.armstrongnumber;

public class ArmstrongNumber {
	int number;
public ArmstrongNumber(int number) {
	this.number=number;
}
public int calculateNoOfDigit() {
	int temp=number;
	int count=0;
	while(temp!=0) {
		temp/=10;
		count++;
	}
	return count;
}
public int calculatePower(int digit,int count ) {
	int power=1;
	for(int i=0;i<count;i++) {
		power*=digit;
	}
	return power;
}
public boolean isArmstrong() {
	int result=0;
	int temp=number;
	int count=calculateNoOfDigit();
	while(temp!=0) {
		result+=calculatePower(temp%10,count);
		temp/=10;
	};
	return result==number;
}
}
