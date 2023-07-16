import java.util.Scanner;

public class Recc_6 {
    int count =0;
    int THO(int n,String a,String b,String c){
        count++;
        if(n==1){
            System.out.println("Move 1 from rod "+ a+" to rod "+ c);
        }
        else{
        THO(n-1,a,c,b);
        System.out.println("Move "+n+" from rod"+a+" to rod"+c);
        THO(n-1,b,a,c);
        }
        return count;
    }
    public static void main(String[] args) {
        String a="A",b="B",c="C";
        Recc_6 r=new Recc_6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ther are 3 rods A,B,C. we should move n disk from sorce A to destination C ");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        // r.THO(n,a,b,c);
        System.out.println("Total number of moves is:"+r.THO(n,a,b,c));
        sc.close();
    }
}
