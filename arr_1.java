import java.util.Scanner;

public class arr_1 {


static String casecount (String input, int n){
    String str =new String();
    str =input;
    int count=0;
    String str1=new String();
    for(int i=0 ;i<n;i++){
        if(str.charAt(i)>97){
            str1= str1+str.charAt(i);
            count++;
        }
    }

    return (str1+":"+count);
}

// static void pushz(int arr[]){
//     int i=0;
//     int j= arr.length-1;
//     while (i<j) {
//         if(arr[i]==0){
//             if(arr[j]>0){
//                 int temp =arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//             else
//             j--;

//         }
//         else
//             i++;
        
        
//     }
 
// }
public static void main(String[] args) {
    String input =new String();
    Scanner sc =new Scanner(System.in);
    input =sc.nextLine();
    int n= input.length();
    String x =new String();
    x= casecount(input,n);
    System.out.println( x);
    sc.close();
    //  int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
    //  System.out.println(arr.length);
    // pushz(arr);
    // for(int a=0; a<arr.length; a++){
    //     if(a==arr.length-1){
    //         System.out.print(arr[a]);
        }

    //     else
    //     System.out.print(arr[a]+",");
    // }
   
}


