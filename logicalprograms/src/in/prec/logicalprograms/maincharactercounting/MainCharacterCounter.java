package in.prec.logicalprograms.maincharactercounting;
import in.prec.logicalprograms.charactercounting.CharacterCounting;
import java.util.Scanner;

public class MainCharacterCounter {
public static void main(String args[]) {
	CharacterCounting characercounting=new CharacterCounting();
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	characercounting.setVariable(input);
	characercounting.countVowels();
}
}
