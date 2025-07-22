package PatternQuestions;

public class Question4 {
    
	
	public static void main(String [] args) {
		
		int n=5;
		
		int row=1;
		
		// Obervesation Part
		int nst=1;
		//int nsp=n-1;
		while(row<=2*n -1) {
			
			// work for 1st Row
//			int i=1;
//			while(i<=nsp) {
//				System.out.print(" "+" ");
//				i=i+1;
//			}
			
			// work for star
			int j=1;
			while(j<=nst) {
				
				System.out.print("*"+" ");
				j=j+1;
			}
			
			// Preparation for Next row
////			nsp=nsp-1;
//			nst=nst+1;
			
			if(row<n) {
				nst=nst+1;
			}else {
				nst=nst-1;
			}
			
			row=row+1;
			System.out.println();
		}
	}
}
