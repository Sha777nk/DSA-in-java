import java.util.Scanner;

public class Recc_7 {
    int josephus (int n,int k){
        if(n==1){
            return 0;
        }
        else{
            return(josephus(n-1,k)+k)%n;
        } 
    }
    public static void main(String[] args) {
        Recc_7 r=new Recc_7();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and k: ");
        int n = sc.nextInt();
        int  k = sc.nextInt();
        System.out.println(r.josephus(n,k)+1);
        sc.close();
    }
}
