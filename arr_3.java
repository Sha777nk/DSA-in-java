public class arr_3 {
    public static int mean(int arr[],int n){
        int  sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;
    }
    public static int median(int arr[],int n){
    
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        if(n%2==0)
        return (arr[(n/2)-1]+arr[n/2])/2;
        else
        return arr[n/2];
    }

    public static void main(String[] args) {
        int []arr={1, 2, 19, 28,5};
         int n=arr.length;
        System.out.println("Mean is: "+mean(arr,n));
        System.out.println("Median is: "+median(arr,n));
        
    }
}
