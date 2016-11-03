package begin;

import java.util.Scanner;

public class AgeInfo {

	public static void main(String[] args) {
		
		System.out.println("Enter your age: ");
		Scanner age = new Scanner(System.in);
				int a = age.nextInt();
		//System.out.println(a);
		if (a<17){
			System.out.println("You cannot drive, you cannot work, you cannot rent a car");
		}else if (a<=17){
			System.out.println("You cannot drive");
		}else if (a<=17 || a<=19){
			System.out.println("You cannot work");
		}else if (a>=19 && a<25){
			System.out.println("You cannot rent a car");
		}else
		{
			System.out.println("you are good to do whatever you want");
		}
		

	}

}
