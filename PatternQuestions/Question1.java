package PatternQuestions;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n=5;
		
		int row=1;
		
		// Obervesation 
		int nst=n; // nst -> no of Stars
		
		for(;row<=n;) {
			
			// work
			 // ith star ko print karne ja raha hu
			for(int i=1;i<=nst; i=i+1) {
				System.out.print("*"+" ");
			}
			
			// Preparation for Next row
			nst=nst-1;
			
			row=row+1;
			System.out.println();
		}
		
	}

}
