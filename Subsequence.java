// "static void main" must be defined in a public class.
public class Main {
    
    public static void decimalToBinary(int n, int [] arr){
        
          int index=0;
         while(n>0){
 
             int bit= n%2;
             if(bit==1){
                 System.out.print(arr[index]+" ");
             }
             index++;
             n=n/2;
         }
        
    }
    public static void main(String[] args) {
        
        int [] arr={1,2,3,4};
        
        int n= arr.length;
        
        for(int i=0; i<(1<<n); i++){
            System.out.print(i+" [");
            decimalToBinary(i, arr);
            System.out.print(" ] ");
            System.out.println();
        }
    }
}
