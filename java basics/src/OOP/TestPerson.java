package OOP;

public class TestPerson {
public static void main(String[] args) {

	Person p = new Person();
	p.setName("Rishi");
	System.out.println(p.getName());
	
	p.setDob("02/01/1998");
	System.out.println(p.getDob());
	
	p.setAddress("Amay Appartment Shopping Complex Indore");
	System.out.println(p.getAddress());
	
	System.out.println(Person.age);
}

}

