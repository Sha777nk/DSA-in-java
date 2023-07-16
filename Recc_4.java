import java.util.Scanner;

public class Recc_4 {
    int sum=0;
    int digitalRoot(int n){
        int rem;
        rem=n%10;
        if(n!=0){
            n=n/10;
            sum=sum+rem;
            return digitalRoot(n);
        }
        else{
            int num;
            num=sum/10;
            if(num==0){
                return sum;
            }
            else{
            n=sum;
            sum=0;
            return digitalRoot(n);
            }

        }
    }
    public static void main(String[] args) {
        Recc_4 r = new Recc_4();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Sum Of Disgits is:"+r.digitalRoot(n));
        sc.close();
    }
}
