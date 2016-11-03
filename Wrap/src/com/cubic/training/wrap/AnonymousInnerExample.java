package com.cubic.training.wrap;

public class AnonymousInnerExample {

	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Eat globity goo");
				
			}
		};
		p.eat();
		/*new Person() {
			
			@Override
			void eat() {
				System.out.println("Eat globity goo");
				
			}
		}.eat();*/
		Printable pr = new Printable() {
			public void print(){
				System.out.println("printintintintin");
			}
		};
		pr.print();
	}

}
