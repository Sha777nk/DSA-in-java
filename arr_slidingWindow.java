public class arr_slidingWindow {
    static int maxSum(int arr[], int n, int k)
    {
        int cur_sum=0;
        for(int i=0 ;i<k;i++){
            cur_sum+=arr[i];
        }
        int max_sum= cur_sum;
        for(int j=k;j<n;j++){
             cur_sum+=(arr[j]-arr[j-k]);
            max_sum=Math.max(cur_sum, max_sum);
        }
        return max_sum;

       
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 


}



