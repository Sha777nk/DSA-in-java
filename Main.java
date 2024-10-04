import java.util.*;

public class Main{


public static boolean ispalindrome(int x){
int a=x;
int reversed=0,rem;
while(a>0){
rem=a%10;
a=a/10;
reversed=reversed*10+rem;
}
if (x==reversed) {
    System.out.print(x+",");
}
return(x == reversed);
}

public static void main(String []args){
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();

int [n]arr;
int count =0;
for (int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
if(ispalindrome(i)){
count ++;
}
}
System.out.println("\nThe Number of palindrome in the range is:"+count);
}
}