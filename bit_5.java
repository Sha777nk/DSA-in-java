import java.util.Scanner;
//bit differeane means we see the binary representation of the two numbers and if they are not same at any point we will count++ or else not do.
public class bit_5 {
    int bitCountFlip(int a,int b){
        int xor =a^b;
        int count=0;
        while (xor != 0) {
            count += xor & 1; // Check if the least significant bit is set
            xor >>= 1; // Right shift to check the next bit
        }

        return count;
    }
    public static void main(String[] args) {
        bit_5 c=new bit_5();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Number of bits to be fllied is:"+c.bitCountFlip(a, b));
        sc.close();

    }
}
