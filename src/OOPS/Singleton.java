package OOPS;

public class Singleton {
	
	private static Singleton instance; // Singleton is of Non-primitive type.
	private Singleton() {} // Declare constructor as private.
	
	public static synchronized Singleton getInstance()
	//Method which has synchronized and return the instance with 
	// Non primitive type. i.e. class name : Singleton here. 
	{
		if (instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}

}
