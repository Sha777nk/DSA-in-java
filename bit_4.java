import java.util.Scanner;

public class bit_4 {
    int countSetBits(int n){
        int count=0,num;
        for(int i=1;i<=n;i++){
            num=i;
            while(num>0){
                count += num & 1; // Check if the least significant bit is set
                num >>= 1; // Right shift to check the next bit
            }
            
        }
        return count;

    }
    public static void main(String[] args) {
        bit_4 b=new bit_4();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Number of set bit is :"+b.countSetBits(n));
        sc.close();
    }
    
}
