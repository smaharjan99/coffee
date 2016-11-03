package training;

public class Address {
	
	String city;//instance variables
	String state;
	String street;
	int zipcode;
	
	public Address(String city, String state, String street, int zipcode) {
		// parameterized constructor with local variables
		this.city = city;
		this.state = state;
		this.street = street;
		this.zipcode = zipcode;
	}

	public Address(){ //default constructor as 
		//it has no parameters of nothing in braces
		// if there is no constructor in the code
		//the compiler creates a default constructor
		
	}
	

/*
	public static void main(String[] args) {
		Address a = new Address("Tallahassee", "Florida", "Augustine rd", 32301);
		Address a1 = new Address("Irving","Texas", "Meadow Creek", 75656);
		System.out.println(a.city);
		System.out.println(a.state);
		System.out.println(a.zipcode);
		System.out.println(a.street);
		System.out.println(a1.city);
		System.out.println(a1.state);
		System.out.println(a1.zipcode);
		System.out.println(a1.street);
	}
*/
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
