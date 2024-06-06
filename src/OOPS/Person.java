package OOPS;

public class Person {
	private String name;
	private int age;
	
	Person(String name, int age)
	{
		this.name = name;
		try {
		if (age > 0)
		{ this.age = age;}
		else
		{
			throw new AgeException();
		}
		}
		catch( Exception e)
		{
			System.out.println("Age must be +ve number");
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		try {
		if (age > 0)
		{
			this.age = age;
		}
		else
		{
			throw new AgeException();
		}
		}
		catch (Exception e)
		{
			System.out.println("Age should be positive number");
		}
		}
	
	public String toString()  // This should be outside of Anymethod be careful here. 
	{
		return "Name is:" + name + "," + "Age is:" + age;
	}
}
