// Given an array Arr of n integers arranged in a circular fashion. Your task is to find the minimum absolute difference between adjacent elements.
public class arr_9 {
    int minAdjDiff(int arr[],int n){
        int result = Integer.MAX_VALUE; 
        for (int i = 0; i < n; i++) {
            int diff;
            if (i == n - 1) {
                diff = Math.abs(arr[i] - arr[0]);
            } else {
                diff = Math.abs(arr[i] - arr[i + 1]);
            }
            result = Math.min(result, diff);
        }
        
        return result;

    }
    public static void main(String[] args) {
        arr_9 a=new arr_9();
        int arr[]={10,-3,-4,7,6,5,-4,-1};
        int n=arr.length;
        int res=a.minAdjDiff(arr, n);
        System.out.println("minimum difference is:"+res);
    }
}
