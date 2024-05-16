package CodeSignal;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() // No parameters supposed to be passed to getters().
	{
		return name;
		
	}
	
	public void setName(String name) // Parameters need to be passed for setters().
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String toString() {
		return "name " + name +  " age " + age; 
	}
	
	public <T> T[] toArray(T[] a)
	{
		
		return a;
		
		
		
	}
	
	
	
	

}
