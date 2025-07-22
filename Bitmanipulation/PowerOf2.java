package Bitmanipulation;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 18;

		int count = 0;
		while (a != 0) {

			int bit = a & 1;
			count += bit;

			a = a >> 1;
		}
		
		if(count==1) {
			System.out.println("a is Power of 2");
		}else {
			System.out.println("a is Not Power of 2");
		}
		
		a=18;
		if( (a & (a-1)) ==0) {
			System.out.println("a is Power of 2");
		}else {
			System.out.println("a is not power of 2");
		}
		
		
	}
	

}
