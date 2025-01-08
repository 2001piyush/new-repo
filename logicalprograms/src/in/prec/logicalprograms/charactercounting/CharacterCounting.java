package in.prec.logicalprograms.charactercounting;

public class CharacterCounting {
	String variable;
public void setVariable(String variable) {
	this.variable=variable;
}
public void countVowels() {
	int a=0;
	int e=0;
	int i=0;
	int o=0;
	int u=0;
	int consonentcount=0;
			 
	for(int b=0;b<variable.length();b++) {
		switch(variable.charAt(b)) {
		case 'a'-> a++;
		case 'e'-> e++ ;
		case 'i' -> i++;
		case 'o' -> o++;
		case 'u' -> u++;
		default -> consonentcount++;
		}
	}
	System.out.println("count of a"+a);
	System.out.println("count of e"+e);
	System.out.println("count of i"+i);
	System.out.println("count of o"+o);
	System.out.println("count of u"+u);
	System.out.println("count of consonent"+consonentcount);

}
}
