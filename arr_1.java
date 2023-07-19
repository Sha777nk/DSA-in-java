import java.util.Scanner;

public class arr_1 {
   public static void insert_at_end(int arr[],int num){
    arr[arr.length-1]=num;
    System.out.println(num+" is inserted at end Output is: ");
}
public static void main(String[] args) {
    int []arr={1,2,3,4};
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to be inserted at end:");
    int num=sc.nextInt();
    sc.close();
    insert_at_end(arr,num);
    for(int i=0; i<arr.length;i++)
        System.out.print(arr[i]+" ");
   }
   
}
