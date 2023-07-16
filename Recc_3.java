import java.util.Scanner;

public class Recc_3 {
     int count=0;
    int numOfDigits(int n){
        if(n!=0){
            n=n/10;
            count++;
            return numOfDigits(n);
        }
        else{
            return count;
        }
    }
    public static void main(String[] args) {
        Recc_3 r = new Recc_3();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Sum Of Disgits is:"+r.numOfDigits(n));
        sc.close();
}
}