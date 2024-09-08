package math;

public class Minimum_Jumps {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        // If the array has only one element, no jumps are required
        if (arr.length <= 1) {
            System.out.print(0) ;
        }

        // If the first element is 0, we can't move anywhere
        if (arr[0] == 0) {
            System.out.print(-1);
        }

        // Initialize variables
        int jumps = 0;
        int currEnd = 0; // The current range of the jump
        int farthest = 0; // The farthest we can reach

        for (int i = 0; i < arr.length - 1; i++) {
            // Update farthest point we can reach
            farthest = Math.max(farthest, i + arr[i]);

            // If we reached the end of the current jump range
            if (i == currEnd) {
                jumps++; // Increment the number of jumps
                currEnd = farthest; // Update the current range to farthest

                // If the current range reaches or exceeds the last index, we're done
                if (currEnd >= arr.length - 1) {
                    System.out.print(jumps) ;
                }
            }

            // If we are unable to move further
            if (currEnd <= i) {
                System.out.print(-1) ;
            }
        }

        System.out.print(-1) ; // If we can't reach the last element
    }
}
