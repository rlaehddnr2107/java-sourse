package ex07_jdbc;

//dto 데이터를 담아서 옮기는 
public class EmployeesDTO {
private String employee_ID;
private String FIRST_NAME;
private int SALARY;
public EmployeesDTO(String employee_ID, String fIRST_NAME, int sALARY) {
	super();
	this.employee_ID = employee_ID;
	FIRST_NAME = fIRST_NAME;
	SALARY = sALARY;
}
public String getEmployee_ID() {
	return employee_ID;
}
public void setEmployee_ID(String employee_ID) {
	this.employee_ID = employee_ID;
}
public String getFIRST_NAME() {
	return FIRST_NAME;
}
public void setFIRST_NAME(String fIRST_NAME) {
	FIRST_NAME = fIRST_NAME;
}
public int getSALARY() {
	return SALARY;
}
public void setSALARY(int sALARY) {
	SALARY = sALARY;
}
@Override
public String toString() {
	return "EmployeesDTO [employee_ID=" + employee_ID + ", FIRST_NAME=" + FIRST_NAME + ", SALARY=" + SALARY + "]";
}

}
