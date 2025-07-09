package oopsAndInheritance;

public class Employee extends Person{
	private double salary;
	private String joinDate;
	private String insuranceNo;
	public Employee(String name,double salary, String joinDate, String insuranceNo) {
		super(name);
		this.salary = salary;
		this.joinDate = joinDate;
		this.insuranceNo = insuranceNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getInsuranceNo() {
		return insuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	public String toString() {
		return super.toString()+"\n"+"Employee salary=" + salary + "\n"+ "joinDate=" + joinDate +"\n"+"insuranceNo=" + insuranceNo ;
	}
	
	
}
