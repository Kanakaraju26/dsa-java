package heap.medium;

import java.util.Arrays;
import java.util.HashMap;

public class replace_elements_by_its_rank_in_the_array {
    static int[] replaceWithRank(int arr[], int N) {
     int[] sortedArr = arr.clone();
    Arrays.sort(sortedArr);

    // Step 2: Create a map to store the rank of each element
    HashMap<Integer, Integer> rankMap = new HashMap<>();
    int rank = 1;
    for (int num : sortedArr) {
        if (!rankMap.containsKey(num)) { // Assign rank only once for each unique value
            rankMap.put(num, rank);
            rank++;
        }
    }

    // Step 3: Replace elements in the original array with their ranks
    int[] result = new int[N];
    for (int i = 0; i < N; i++) {
        result[i] = rankMap.get(arr[i]);
    }

    return result;
  }
}
