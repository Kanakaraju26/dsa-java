package StackAndQueue.MonotonicStacksAndQueue;

public class number_of_nges_to_the_right {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
          int[] count = new int[N];
            
            // Compute the count of greater elements for each index
            for (int i = 0; i < N; i++) {
                count[i] = 0;
                for (int j = i + 1; j < N; j++) {
                    if (arr[j] > arr[i]) {
                        count[i]++;
                    }
                }
            }
    
            // Prepare the result for the given indices
            int[] result = new int[queries];
            for (int i = 0; i < queries; i++) {
                result[i] = count[indices[i]];
            }
    
            return result;
      }
}
