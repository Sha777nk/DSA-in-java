import java.util.Scanner;

public class bit_1 {
    int getFirstSetBit(int n){
        int rem,count=0;
           while(n>0){                                  
              rem=n%2;
              n=n/2;
                
                if(rem==1){
                    count++;
                }
        }
         return count;
        //  brian's kerningm's Algorithm
        // int count=0;
        //  while(n>0){
        //      n=(n&(n-1));
        //       count++;
        //      } 
        //      return count; 
    }
  

      public static void main(String[] args) {
        bit_1 b= new bit_1();
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("the first set bit from the right side is at position :"+b.getFirstSetBit(n));
        sc.close();
       
    }
   
}
