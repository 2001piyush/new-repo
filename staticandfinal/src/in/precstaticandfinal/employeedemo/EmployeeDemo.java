package in.precstaticandfinal.employeedemo;

public class EmployeeDemo {
String employeename;
float employeesalary;
final int retirementage;
static String organizationname;

public EmployeeDemo(String employeename, float employeesalary, int retirementage) {
	super();
	this.employeename = employeename;
	this.employeesalary = employeesalary;
	this.retirementage = retirementage;
}
@Override
public String toString() {
	return "EmployeeDemo [employeename=" + employeename + ", employeesalary=" + employeesalary + ", retirementage="
			+ retirementage + "]";
}

public static String getOrganizationname() {
	return organizationname;
}
public static void setOrganizationname(String organizationname) {
	EmployeeDemo.organizationname = organizationname;
}
public String getEmployeename() {
	return employeename;
}

public void setEmployeename(String employeename) {
	this.employeename = employeename;
}

public float getEmployeesalary() {
	return employeesalary;
}

public void setEmployeesalary(float employeesalary) {
	this.employeesalary = employeesalary;
}

public int getRetirementage() {
	return retirementage;
}


}
