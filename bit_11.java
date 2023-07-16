import java.util.Scanner;

public class bit_11 {
    public static int swapBits(int N){
        int evenMask = 0xAAAAAAAA;
        int oddMask = 0x55555555;
        int evenBits = N & evenMask;
        int oddBits = N & oddMask;
        evenBits >>= 1;
        oddBits <<= 1;
        int result = evenBits | oddBits;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("The value after swapped is:"+swapBits(n));
        sc.close();
    }
}
