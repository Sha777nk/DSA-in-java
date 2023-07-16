import java.util.Scanner;

public class bit_9 {
          public static int DeciamlToGray(int N) {
        int binary = N;
        int gray = binary;

        int mask = gray >> 1;
        while (mask != 0) { 
            gray ^= mask;
            mask >>= 1;
        }
        return gray;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of N:");
        int N=sc.nextInt();
        int decimaltogray = DeciamlToGray(N);
        System.out.println(decimaltogray);  
        sc.close();
    }
}

