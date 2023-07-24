public class arr_6 {
    public static void StrongNeb(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = Math.max(arr[i], arr[i + 1]);
            System.out.print(max + " ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,1,3,4,5};
        StrongNeb(arr);
    }
}
