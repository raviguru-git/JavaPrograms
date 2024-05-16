package CustomException;

public class Emp {
	String name;
	int id;
	double sal;
	
	
	Emp(String name,  int id, double sal)
	{
		try {
			
	
		this.name = name;
	    this.id = id;
		if (sal>=0)
		{
			this.sal= sal;
		}
		else
		{
			throw new SalaryException();
		}
		} catch (Exception e)
		{
			System.out.println("Salary must be positive ");
		}
		
		
	
	}
	public String toString()
	{
		return name +"  "+ id + "  "+ sal;
	}

	
	
	

}
