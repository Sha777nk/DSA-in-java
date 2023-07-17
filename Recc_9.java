import java.util.Scanner;

public class Recc_9 {
    int RecursivePower(int n,int k){
        if(k==0){
            return 1;
        }
            return n* RecursivePower(n,k-1);
    }
    public static void main(String[] args) {
        Recc_9 r =new Recc_9();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and k: ");
        int n = sc.nextInt();
        int  k = sc.nextInt();
        System.out.println(r.RecursivePower(n, k));
        sc.close();

    }
}
