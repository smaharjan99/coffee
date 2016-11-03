package begin;

public class FibonacciSeq {
	int i =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		for (int j = 0; j<100; j=i-j){
			System.out.println(i);
			 i=i+j;
		}
	}

}
