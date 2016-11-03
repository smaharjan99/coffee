package com.cubic.training.exceptionassignment;

public class AllThreeHere {
	
	static void slow(int go)throws OneTypeofException, TwoTypeofException, ThreeTypeofException{
		
		if(go==1 ){
			throw new OneTypeofException("First Error ");
		}else if (go==1){
		 throw new TwoTypeofException("Second Error ");
		}else if(go==3){
			throw new ThreeTypeofException("Third Error");
		}else{
			System.out.println("Nothing here");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			slow(3);
			
		} catch (OneTypeofException | TwoTypeofException | ThreeTypeofException e) {
			// TODO Auto-generated catch block
			System.out.println("All Three Exceptions Handled \n" + e);
		}
	}

}
