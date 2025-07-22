package Bitmanipulation;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=41;
		
		int count=0;
		while(a !=0) {
			
			int bit= a &1;
			count+=bit;
			
			a=a>>1;
		}
		System.out.println(count);
		
		
		
	}

}
