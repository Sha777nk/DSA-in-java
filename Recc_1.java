import java.util.Scanner;

public class Recc_1 {
     int i=1;
    int printNos(int n){
       if(i<=n){
        System.out.print( "  "+i);
        i++;
        return printNos(n);
    }
    return 0;

}
    public static void main(String[] args) {
        Recc_1 r=new Recc_1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        r.printNos(n);
        sc.close();
    }
}
