public class arr_4 {
    public static int majorityWins(int arr [],int n,int x,int y){
        int r1=0,r2=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==x){
                r1++;
            }
            else if(arr[i]==y){
                r2++;
                
            }
            
        }
        if(r2>r1){
            System.out.println("frequency of y:"+r2);
            return y;
        }
        else{
            System.out.println("frequency of x:"+r1);
            return x;
        }

    }
    public static void main(String[] args) {
        int []arr={1,2,2,2,2,3,4,5,5,5,6};
        int n=arr.length;
        int x=2,y=5;
        System.out.println("Majority is:"+majorityWins(arr, n,x,y));
    }
}
