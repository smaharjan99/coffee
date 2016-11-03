package com.cubic.training.access;

public class Cat {
	/*void eat(){
		System.out.println("Cat is eating");
	}*/

	public static void main(String[] args) {
		try{
			int a[] = new int[5];
			a[5]=30/2;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}finally{
			System.out.println("finally block always executes");


			/*catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("division by zero happened " );

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("check the size of your array ");
		}catch(Exception e){
			System.out.println("some other");*/
		}
		System.out.println("rest of the code");
	}





}
/*	try{
int a = 10/0;

System.out.println(a);
}catch(ArithmeticException a){
System.out.println("Division by zero happened " + a);
}
System.out.println("rest of the code");*/ //try and catch example


//Array Example
/*int a[]= new int[5];//declaring and instantiation
a[0] = 20;//initialization 
a[1] = 30;
a[2] = 40;
a[3] = 50;
a[4] = 60;

for(int i=0; i<a.length; i++){
System.out.println(a[i]);*/