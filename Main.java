// import java.util.*;

// public class Main{


// public static boolean ispalindrome(int x){
// int a=x;
// int reversed=0,rem;
// while(a>0){
// rem=a%10;
// a=a/10;
// reversed=reversed*10+rem;
// }
// if (x==reversed) {
//     System.out.print(x+",");
// }
// return(x == reversed);
// }

// public static void main(String []args){
// Scanner sc =new Scanner(System.in);
// int n=sc.nextInt();
// int sum=0;

// int []arr=new int [n];
// int count =0;
// for (int i=0;i<n;i++){
// arr[i]=sc.nextInt();
// }

// for (int i=0;i<n;i++){
//     sum+=arr[i];
//     }

// for(int i=0;i<n;i++){
// if(ispalindrome(i)){
// count ++;
// }
// }
// System.out.println("\nThe Number of palindrome in the range is:"+count);
// System.out.println("\nThe sum of array:"+sum);
// System.out.println("\nThe avg of array:"+(float)sum/arr.length);
// }
// }

import java.util.*;

public class Main{

public static int Sum(int arr[]){
int sum=0;
for(int i=0; i<arr.length;i++){
sum+=arr[i];
}
return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the comma-separated string of numbers
        String x = sc.nextLine();

        // Split the string based on commas
        String[] s = x.split(",");

        // Create an integer array based on the number of split elements
        int[] arr = new int[s.length];

        // Convert each split string into an integer and store it in the array
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

      System.out.println(Sum(arr));
      System.out.println((float)Sum(arr)/arr.length);
      sc.close();
    }
}

