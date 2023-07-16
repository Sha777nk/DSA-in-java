import java.util.Scanner;

public class bit_7 {
    int maxCountOnes(int n){
        int count=0,length=0;
        while(n>0){
            if((n&1)==1){
                count++;
                if(length<count){
                    length=count;
                }
                
            }
            else{
                count=0;
            }
            n= n>>1;
        }
        return length;
    }

    public static void main(String[] args) {
        bit_7 b=new bit_7();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.println("Longest ones is:"+b.maxCountOnes(n));
        sc.close();
    }
}
