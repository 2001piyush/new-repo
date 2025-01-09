package in.precstaticandfinal.main;
import in.precstaticandfinal.employeedemo.EmployeeDemo;

public class MainEmployee {
public static void main(String[] args) {
	EmployeeDemo.setOrganizationname("apple");
	EmployeeDemo employeedemo=new EmployeeDemo("abc",30000,100);
	System.out.println(employeedemo);
}
}
