// Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
public class arr_11 {
    public static void convertToWave(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        convertToWave(arr);
    }
}


