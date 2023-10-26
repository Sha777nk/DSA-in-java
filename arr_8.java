// Given an unsorted array arr[] of size N, rotate it by D elements in the counter-clockwise direction. 
public class arr_8 {
    public static void rotatearr(int arr[],int d,int n){
        int[] temp =new int[d];
        for(int j=0;j<d;j++){
            temp[j]=arr[j];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for (int i = n - d, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6};
        int n=arr.length;
        int d=1;
        rotatearr(arr, d, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
