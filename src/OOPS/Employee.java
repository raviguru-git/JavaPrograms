package OOPS;

public class Employee {
	
	
	int id;
	String name;
	double salary;
	
	Employee(int id)
	{
		this.id = id;
		//System.out.println("Inside ID Constructor");
	}
	
	Employee(int id, String name)
	{
		this(id);
		this.name = name;
		//System.out.println("Inside ID and name Constructor");
	}
	Employee(int id, String name, double salary)
	{
		this(id,name);
		try {
		if ( salary > 0)
		{
		this.salary = salary;
		}
		else
		{
			throw new SalaryException();
		}
		}
		catch (Exception e)
		{
			System.out.println("Salary must be positive  number");
		}
		
		//System.out.println("Inside ID,name and Salary Constructor");
		
	}
	
	public String toString()
	{
		return " name is: " + name + "," + " id " + id + "," + " Salary: " + salary;
		
	}
	

}
