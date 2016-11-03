package begin;
import java.util.Scanner;

public class ArrayExplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create array of integers
		//anArray = new int[10];
		//assign values to elements
		int[] anArray = {
		10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		System.out.println(anArray.length);
	//method for addition
	 // get input for array
		System.out.print("Enter new array element - ");
	 Scanner near = new Scanner(System.in);
					int newArray = near.nextInt();
	//add element
	int[] newAr = new int[anArray.length+1];
	for(int i=0; i < anArray.length; i++)
		newAr[i] = anArray[i];
		newAr[newAr.length-1] = newArray;
		anArray = newAr;
		for(int j=0; j < newAr.length; j++){
		System.out.println(newAr[j]);
		}
	}

}
