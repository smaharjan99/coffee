package com.cubic.application.ui;

import java.util.Scanner;

public class MainUI implements addData, deleteData, searchData, updateData {
	public int id, age, salary;
	public String name, address, gender, department;

	public int choice, editNum;

	@Override
	public String toString() {
		return "MainUI [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + ", address=" + address
				+ ", gender=" + gender + ", department=" + department + ", choice=" + choice + ", editNum=" + editNum
				+ ", input=" + input + "]";
	}

	public MainUI() {

	}

	public MainUI(int id, int age, int salary, String name, String address, String gender, String department,
			int choice, int editNum, Scanner input) {
		// super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.department = department;
		this.choice = choice;
		this.editNum = editNum;
		this.input = input;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public int editNum() {
		return editNum;
	}

	public void editNum(int editNum) {
		this.editNum = editNum;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	Scanner input = new Scanner(System.in);

	public void menu() {
		System.out.println("What do you wanna do?\n1.Add\n2.Update\n3.Delete\n4.Search\n5.Display\n6.EXIT");
		System.out.print("Your Choice - ");
		editNum = input.nextInt();
		choice = editNum;

	}

	public void add() {
		System.out.println("Enter id - ");
		id = input.nextInt();

		System.out.print("Enter Name - ");
		name = input.next();

		System.out.print("Enter address- ");
		address = input.next();

		System.out.print("Enter gender - ");
		gender = input.next();

		System.out.print("Enter salary - ");
		salary = input.nextInt();
		System.out.print("Enter department - ");
		department = input.next();
	}

	public void update() {
		System.out.println("Enter the id to update - ");
		id = input.nextInt();

		System.out.print("Enter Name - ");
		name = input.next();

		System.out.print("Enter address- ");
		address = input.next();

		System.out.print("Enter gender - ");
		gender = input.next();

		System.out.print("Enter salary - ");
		salary = input.nextInt();
		System.out.print("Enter department - ");
		department = input.next();
	}

	public void delete() {
		System.out.println("Enter the Id to delete - ");
		id = input.nextInt();
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub

	}

	public void display() {
		System.out.println("DATA from The Table");
	}

}
