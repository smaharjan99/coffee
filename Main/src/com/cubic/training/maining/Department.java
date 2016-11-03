package com.cubic.training.maining;

import java.util.Scanner;

public class Department {

	Scanner in = new Scanner(System.in);
	int empNum;
    int deptNum;
    int editNum;
    int choice;
    int choice2;
	
	
	public Department() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Department(int empNum, int deptNum, int editNum, int choice, int choice2) {
		//super();
		this.empNum = empNum;
		this.deptNum = deptNum;
		this.editNum = editNum;
		this.choice = choice;
		this.choice2 = choice2;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public int getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(int deptNum) {
		this.deptNum = deptNum;
	}

	public int getEditNum() {
		return editNum;
	}

	public void setEditNum(int editNum) {
		this.editNum = editNum;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getChoice2() {
		return choice2;
	}

	public void setChoice2(int choice2) {
		this.choice2 = choice2;
	}
	
	void chooseDepartment(){
		System.out.println("Which is Your Department: \n1.IT\n2.Marketing\n3.Sales");
		System.out.print("Your Choice - ");
		deptNum = in.nextInt();
		choice = deptNum;
	}
	void editDepartment(){
		System.out.println("What do you wanna do?\n1.Add\n2.Edit\n3.Delete\n4.Display\n5.Total Income\n6.Search\n7.Sort\n8.EXIT\n9.Blink");
		System.out.print("Your Choice - ");
		editNum = in.nextInt();
		choice2 = editNum;
	}
}
