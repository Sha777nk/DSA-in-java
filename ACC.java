import java.util.Scanner;

public class ACC {

    static int vowelpur(String input) {
        String str =new String();
        str = input;
        char x[]= str.toCharArray();
        int count=0;
        int pur=1;
        for(int i=0; i<x.length;i++){
            if(x[i]=='A'||x[i]=='E'||x[i]=='I'||x[i]=='O'||x[i]=='U'){

            }
            else{
                count++;
            }
        }
        for(int i=1;i<=count;i++){
            pur=pur*i;
        }
        return pur;

    }

    public static void main(String[] args) {
    String input =new String();
    Scanner sc =new Scanner(System.in);
    input =sc.nextLine();
    int x;
    x= vowelpur(input) ;
    System.out.println( x);
    sc.close();
    }
}
