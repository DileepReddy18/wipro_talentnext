package java_fundamentals;

import java.util.*;
class Employee{
	int empId;
	String empName;
	String joinDate;
	char dCode;
	String dept;
	int basic;
	int hra;
	int it;
	Employee(int empId,String empName,String joinDate,char dCode,String dept,int basic,int hra,int it){
		this.empId=empId;
		this.empName=empName;
		this.joinDate=joinDate;
		this.dCode=dCode;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
		}
}
public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id=sc.nextInt();
		Employee[] employees= {
				new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
	            new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
	            new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
	            new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
	            new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
	            new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
	            new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
		};
		boolean found=false;
		for(Employee emp:employees) {
			if(emp.empId==id) {
				found=true;
				String designation="";
				int da=0;
				switch(emp.dCode) {
				case 'e':
                    designation ="Engineer";
                    da = 20000;
                    break;
                case 'c':
                    designation ="Consultant";
                    da = 32000;
                    break;
                case 'k':
                    designation ="Clerk";
                    da = 12000;
                    break;
                case 'r':
                    designation ="Receptionist";
                    da = 15000;
                    break;
                case 'm':
                    designation ="Manager";
                    da = 40000;
                    break;
                default:
                    designation ="Unknown";
                    da = 0;
				}
				int salary=emp.basic+emp.hra+da-emp.it;
				System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tsalary");
				System.out.println(emp.empId+"\t"+emp.empName+"\t"+emp.dept+"\t"+designation+"\t"+salary);
				break;
			}
		}
		if(!found) {
			System.out.println("There is no employee with empid :"+id);
		}
		
	}

}
