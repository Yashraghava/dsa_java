package com.dsa.recursion;
// Function to calculate the maximum amount one can collect
// using the optimal strategy from index i to index j
// using recursion

class GameOfCoin { 
  
    static int maxAmount(int i, int j, int[] arr) {
      
        // Base case: If i > j, no more elements are left to
        // pick
        if (i > j)
            return 0;

        // Option 1: Take the first element arr[i], and then
        // we have two choices:
        // - Skip arr[i+1] and solve the problem for range
        // [i+2, j]
        // - Take arr[i+1] and arr[j-1] (we solve the
        // problem for range [i+1, j-1])
        int takeFirst
            = arr[i]
              + Math.min(maxAmount(i + 2, j, arr),
                         maxAmount(i + 1, j - 1, arr));

        // Option 2: Take the last element arr[j], and then
        // we have two choices:
        // - Skip arr[j-1] and solve the problem for range
        // [i, j-2]
        // - Take arr[i+1] and arr[j-1] (we solve the
        // problem for range [i+1, j-1])
        int takeLast
            = arr[j]
              + Math.min(maxAmount(i + 1, j - 1, arr),
                         maxAmount(i, j - 2, arr));
      
        return Math.max(takeFirst, takeLast);
    }

    static int maximumAmount(int[] arr) {
        
          int n = arr.length;
        int res = maxAmount(0, n - 1, arr);

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 3, 7, 10 };

        int res = maximumAmount(arr);
        System.out.println(res);
    }
}