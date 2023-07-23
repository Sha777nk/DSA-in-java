public class arr_5 {
    public static void largestAndSecond(int arr[]){
        int n=arr.length;
        int lar=arr[0];
        int sec=arr[0];
        for(int i=0;i<n;i++){
            if(lar<arr[i]){
                sec=lar;
                lar=arr[i];
            }
            if((lar>arr[i]) && sec<arr[i]){
                sec=arr[i];
            }
            if(lar==sec){
               sec= -1;
            }
        }
        System.out.println(lar+","+sec);
    }
    public static void main(String[] args) {
        int []arr={50,1,2};
        largestAndSecond(arr);
    }
}
