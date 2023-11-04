package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.Name = "Amal";
		emp1.EmpId = 101;
		emp1.SetSalary (56700);
		
		Employee emp2 = new Employee();
		emp2.Name = "Amul";
		emp2.EmpId = 102;
		emp2.SetSalary (590700);
		
		Employee emp3 = new Employee();
		emp3.Name = "Yusha";
		emp3.EmpId = 103;
		emp3.SetSalary (16700);
		
		
		emp1.display();
		emp2.display();
		emp3.display();
		
		ICICI obj1 = new ICICI();
		obj1.Bankid = 100;
		obj1.AccNo = 56789;
		
		HDFC obj2 = new HDFC();
		obj2.Bankid = 345;
		obj2.Account = 89076;
		
		
	}

}
