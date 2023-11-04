package oops;

public class Employee {
	
	 public String  Name;
	 public int EmpId;
	 private int Salary;
	 
	public void display()
	{
		System.out.println("Name of employee" +  Name);
		System.out.println("Id of employee" +  EmpId);
		System.out.println("Salary of employee" +  Salary);
		
		
	}
	public void SetSalary(int sal)
	{
		this.Salary = sal;
	}

	public Employee()
	{
		
	}
	
	public Employee (String Name1,int EmpId1,int Salary1)
	{
		this.Name = Name1;
		this.EmpId = EmpId1;
		this.Salary = Salary1;
		
		
	}
}
