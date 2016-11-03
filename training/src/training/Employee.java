package training;

public class Employee {
	int id;
	String name;
	Address address;//Address = object, address = variable
	
	public Employee(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display(){
		System.out.println(id +"  " + name);
		System.out.println(address.city +" "+ address.state + " "+ address.street + "  "+ address.zipcode);
	}
	
	public static void main(String[] args) {
		Address address1 = new Address("Downsville", "StupidLand", "Broken Alley", 20102);
		Address address2 = new Address("Borings", "FU", "Sucker St", 80085);
		Employee e = new Employee(001, "Growler", address1);
		Employee e1 = new Employee(002, "Sleepy", address2);
		e.display();
		e1.display();
	
	}
	//int salary =6000;
	

}
