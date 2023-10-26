
import java.util.*;

public class array {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] marks=new int[size];
        //marks[0]= 95;
       // marks[1]= 96;
       // marks[2]= 93;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
       // System.out.println(marks[2]);
        System.out.println("Enter array elements:");
       for(int i=0;i<size;i++)
       {
          marks[i] =sc.nextInt();
       }
       System.out.println("Enter a number to search:");
       int x=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if (x==i) {
                System.out.println("found at index:"+i);
                break;
            }
           // System.out.println(marks[i]);
        }
        
        sc.close();
    }
}