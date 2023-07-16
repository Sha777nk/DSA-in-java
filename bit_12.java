import java.util.Scanner;

public class bit_12 {
   public static void maxAND(int arr[]){
        int maxlength=0;
        int x=0,y=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((arr[i]&arr[j])>maxlength && i!=j){
                    maxlength=(arr[i]&arr[j]);
                    x=arr[i];
                    y=arr[j];
                }
            }
        }
        System.out.println("("+x+","+y+") and max AND is:"+maxlength);
    }   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i] =sc.nextInt();
        }
        maxAND(arr);
        sc.close();
     }

}
