package OOPS;

public class PersonDriver {
	
	public static void main(String[] args) {
		Person p1 = new Person("dinga", 30);
		
		//System.out.println(p1);
		//p1.getAge();
		System.out.println(p1.getAge());
		p1.setAge(-2);
		p1.getAge();
		
	}

}
