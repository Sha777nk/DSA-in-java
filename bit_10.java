import java.util.Scanner;

public class bit_10 {
    public static  boolean ispowOfTow(int n){
        int check=2;
        int count=0;
        while(check<=n){
            check=check<<1;

            if(check==n){
                count=1;
                break;
            }
        }
        if(count==1)
            return true;
        else
            return false;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Is n power of 2:"+ ispowOfTow(n));
        sc.close();
     }
}
