// Given n integer ranges, the task is to find the maximum occurring integer in these ranges. If more than one such integer exits, find the smallest one. The ranges are given as two arrays L[] and R[].  L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.
public class arr_10 {
   public static int maxOccured(int arr1[], int arr2[]) {
        int n = arr1.length;
        int maxRange = -1;

        // Find the maximum range among all the ranges
        for (int i = 0; i < n; i++) {
            maxRange = Math.max(maxRange, arr2[i]);
        }

        int[] freqArray = new int[maxRange + 2]; // Create a frequency array

        // Iterate through each range and update the frequency array
        for (int i = 0; i < n; i++) {
            freqArray[arr1[i]]++;     // Increment the start of the range
            freqArray[arr2[i] + 1]--; // Decrement one after the end of the range
        }

        int maxFrequency = -1;
        int result = -1;
        int prefixSum = 0;

        // Calculate the prefix sum to find the maximum occurring integer
        for (int i = 0; i < freqArray.length; i++) {
            prefixSum += freqArray[i];
            if (prefixSum > maxFrequency) {
                maxFrequency = prefixSum;
                result = i;
            }
        }

        return result;
    }
     public static void main(String[] args) {
        int arr1[]={2,1,3};
        int arr2[]={15,8,12,20,30};
        int res=maxOccured(arr1,arr2);
        System.out.println(res);

    }

    }
    
   

