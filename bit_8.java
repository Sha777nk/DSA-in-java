import java.util.Scanner;

public class bit_8 {
 
      public static int grayToDecimal(int N) {
        int binary = N;
        int decimal = binary;

        int mask = decimal >> 1;
        while (mask != 0) { //but if we run this we get actual gray code of the number and its decimal  converstion
            decimal ^= mask;
            mask >>= 1;
        }
        // decimal ^= mask;        // if we run the stament without runniong the while loop we can get the required output as it is in question

        return decimal;
    }
// here to converet binary to gray we do XOR of the binary i.e: if bianry is 111 then its gray is 101 which is XOR of succive numnbers  11=0 and 01=1 so the number becomes 101 
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of N:");
        int N=sc.nextInt();
        int grayCodeDecimal = grayToDecimal(N);
        System.out.println(grayCodeDecimal);  
        sc.close();
    }
}