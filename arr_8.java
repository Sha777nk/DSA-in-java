// Given an unsorted array arr[] of size N, rotate it by D elements in the counter-clockwise direction. 
public class arr_8 {
    public static void rotatearr(int arr[],int k,int n){
        int[] temp =new int[k];
        for(int j=0;j<k;j++){
            temp[j]=arr[j];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for (int i = n - k, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        rotatearr(arr, k, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
