import java.util.Scanner;

public class bit_6 {
    boolean checkSpeares(int n){
        return(n& n<<1)==-0;
    }
    public static void main(String[] args) {
        bit_6 b=new bit_6();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
       System.out.println("is the n Speares:"+ b.checkSpeares(n));
       sc.close();
    }
}
