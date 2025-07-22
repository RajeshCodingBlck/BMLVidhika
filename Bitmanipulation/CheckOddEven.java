package Bitmanipulation;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=11;
		
		if(a%2 ==0) {
			System.out.println("A is Even");
		}else {
			System.out.println("A is Odd");
		}
		
		// Bit Operator
		if( (a & 1)==0 ) {
			System.out.println("A is Even");
		}else {
			System.out.println("A is Odd");
		}
	}

}
