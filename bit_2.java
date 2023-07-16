import java.util.Scanner;

public class bit_2 {
    int posOfRightMostDiffBit(int m,int n){
    int rem1,rem2,count=1;
    while(m>0||n>0){
    rem1=m%2;
    rem2=n%2;
    if(rem1!=rem2){
        return count;
    }
    else
    count++;
    m=m/2;
    n=n/2;
}
return -1;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of m and n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        bit_2 b =new bit_2();
        System.out.println("They Differ at position:"+b.posOfRightMostDiffBit(m, n));
        sc.close();
}
}