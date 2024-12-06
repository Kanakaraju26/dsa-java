package Greedy.medium;

public class jump_game_i {
    public boolean canJump(int[] nums) {
        int farthest = 0; // Farthest index that can be reached
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                // If current index is beyond the farthest reachable index, return false
                return false;
            }
            // Update the farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);
        }
        // If we completed the loop, we can reach the last index
        return true;
    }
}
