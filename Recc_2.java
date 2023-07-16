import java.util.Scanner;

public class Recc_2 {
    int sum=0;
    int sumOfDigits(int n){
        int rem;
        rem=n%10;
        if(n!=0){
            n=n/10;
            sum=sum+rem;
            return sumOfDigits(n);
        }
        else{
            return sum;
        }
    }
    public static void main(String[] args) {
        Recc_2 r = new Recc_2();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Sum Of Disgits is:"+r.sumOfDigits(n));
        sc.close();
        
    }
}
