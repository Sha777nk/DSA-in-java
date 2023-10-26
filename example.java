// class countN {
//     void countDigit(long n){
//         int count =0;
//         while(n!=0){
//             n=n/10;
//             count++;
//         }
//         System.out.println("Number of digits is "+count);
//     }
// }
 // ------------------------------------------------------------------------------1
// class check_palindrome{
//     void ispalindrome(int n){
//         int d,rev=0,temp;
//         temp=n;
//         while(n>0){
//         d=n%10;
//         rev=rev*10+d;
//         n=n/10;
//         }
        
//         if(temp==rev){
//          System.out.println("Yes"); 
//         }
//         else
//         System.out.println("No");
//     }
// }
 // ------------------------------------------------------------------------------2
//  class factorial{
//     void fact(int n){
//         int i,res=1;
//         for(i=2;i<=n;i++){
//             res=res*i;
//         }
//         System.out.println("Factorial of "+n+"! = "+res);+
//     }
//  }
// ------------------------------------------------------------------------------3
//  class delet{                                                 
//     delet(int [] arr,int x){
//         int n=arr.length;
//         int i;
//     for( i=0;i<n;i++)                                                       
//     if(arr[i]==x){
//         break;
//     }
   
//     if(i==n){
//         System.out.println("Number not present");
//         System.exit(0);
//     }
//     for(int j=i; j<n;j++){
//         arr[j]=arr[j+1];
       
//     }
//     }
  
// }
// ------------------------------------------------------------------------------4
// class larg{
//     int getlargest (int arr[])
//     {
//         int n = arr.length;
    
//     for(int i=0;i<n;i++)
//     {
//         boolean flag =true;
//         for(int j=0;j<n;j++)
//         {
//             if(arr[j]>arr[i])
//             {
//                 flag=false;
//                 break;
//             }
//         }
//         if(flag ==true)
//           return i;
//     }
//     return -1;
//     }
// }
// ------------------------------------------------------------------------------5
// class sorted{
//     void isSorted(int arr[]){
//         int i;
//         boolean x ;
//         for( i=1;i<arr.length;i++){
//             if(arr[i]>arr[i-1]){
//                 x=true;
//             }
//             else{
//                 x=false;
//                 System.out.print("Not ");
//                 break;
//             }
            
//         }
//         if(x=true){
//             System.out.print("Sorted");
//         }
//     }
// }
 // ------------------------------------------------------------------------------6

class example{
    public static void main(String [] args){
        // countN ob =new countN();
        // ob.countDigit(1234);
        // ------------------------------------------------------------------------------1
        // check_palindrome ob =new check_palindrome();
        // ob.ispalindrome(6336);
        // ob.ispalindrome(6633);
        // ------------------------------------------------------------------------------2
        // factorial ob = new factorial();
        // ob.fact(5);
        // ------------------------------------------------------------------------------3
        // int arr[]={1,2,3,4,5};
        // new delet(arr, 4);
        // ------------------------------------------------------------------------------4
        // int []arr={5,8,20,10};
        // larg l= new larg();
        // System.out.println("Largest number is at index: "+l.getlargest(arr)+" \nNumber is:"+arr[l.getlargest(arr)]);
        // ------------------------------------------------------------------------------5
    //     int []arr={1,2,3,4,5};
    //     sorted s =new sorted();
    //     s.isSorted(arr);
    // ------------------------------------------------------------------------------6
     }
}
