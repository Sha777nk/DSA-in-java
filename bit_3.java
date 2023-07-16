import java.util.Scanner;

public class bit_3 {
   void checkKthBit(int n,int k){
    int mask=1 << (k-1);
    if((n & mask)!=0)
        System.out.println("Yes");
    else
        System.out.println("No");
   }
   public static void main(String[] args) {
    bit_3 b=new bit_3();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of n and k:");
    int n=sc.nextInt();
    int k=sc.nextInt();
    // System.out.println(""+b.checkKthBit(n,k));
    b.checkKthBit(n,k);
    sc.close();
   }
}
