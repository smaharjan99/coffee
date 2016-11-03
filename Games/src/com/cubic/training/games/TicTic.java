package com.cubic.training.games;

import java.util.Arrays;
import java.util.Scanner;

public class TicTic {
	static Scanner in = new Scanner(System.in);
	



	static int row;
	static int col;
	static String player1;
	static String player2;
	static int[][] insert1;
	static int[][] insert2;
	static int[][] box = new int[row][col];
	
	public TicTic() {
		
	}
	
	public TicTic(int row, int col, String player1, String player2) {
		
		this.row = row;
		this.col = col;
		this.player1 = player1;
		this.player2 = player2;
	}

	 void players(){
		System.out.print("Enter First player name - ");
		player1=in.next();
		System.out.println("Enter Second PLayer name - ");
		player2= in.next();
	}
	
	 void print(int[][] box2){
		//System.out.println("______");
		for(int r=0; r<box2.length; r++){
			
			for (int c=0; c<box2[r].length;c++){
				
				System.out.print(box2[r][c]+"");
				
			}
			System.out.println("");
			//System.out.println("|_|_|_");
		}
		
	}
 void player1move(){
	 System.out.println("Your Symbol is X");
	System.out.println(player1 + "'s turn");
	System.out.println("Enter Your Row [1 to 3] - ");
	row =in.nextInt();
	System.out.println("Enter your Column[1 to 3] - ");
	col = in.nextInt();
	insert1=box;
}
void player2move(){
	 System.out.println("Your Symbol is O");
	System.out.println(player2 + "'s turn");
	System.out.println("Enter Your Row [1 to 3] - ");
	row =in.nextInt();
	System.out.println("Enter your Column[1 to 3] - ");
	col = in.nextInt();
	insert2=box;
}

	public static void main(String[] args) {
		TicTic t = new TicTic();
		t.players();
	t.print(box);
	System.out.println("Let the game Begin");
	
	t.player1move();
	t.player2move();
	switch(row){
	case 1:
	
		if(row==1&&col==1){
			box[0][0]=1 ;
		}
		if(row==1&&col==2){
			box[0][1]= 1;
		}
		if(row==1&&col==3){
			box[0][2]= 1;
		}
	case 2:
		if(row==2&&col==1){
			box[1][0]= 1;
		}
		if(row==2&&col==2){
			box[1][1]= 1;
		}
		if(row==2&&col==3){
			box[1][2]= 1;
		}
	case 3:
		if(row==3&&col==1){
			box[2][0]= 1;
		}
		if(row==3&&col==2){
			box[2][1]= 1;
		}
		if(row==3&&col==1){
			box[2][2]= 1;
		}
	}
		switch(col){
		case 1:
		
			if(row==1&&col==1){
				box[0][0]= 2;
			}
			if(row==1&&col==2){
				box[0][1]= 2;
			}
			if(row==1&&col==3){
				box[0][2]= 2;
			}
		case 2:
			if(row==2&&col==1){
				box[1][0]= 2;
			}
			if(row==2&&col==2){
				box[1][1]= 2;
			}
			if(row==2&&col==0){
				box[1][2]= 2;
			}
		case 3:
			if(row==3&&col==1){
				box[2][0]= 2;
			}
			if(row==3&&col==2){
				box[2][1]= 2;
			}
			if(row==3&&col==1){
				box[2][2]= 2;
			}
	
	}
		t.print(box);
				System.out.println(Arrays.deepToString(box));
	}
	
	
	
	
}
	
	

