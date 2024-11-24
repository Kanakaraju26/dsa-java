package StackAndQueue.MonotonicStacksAndQueue;
public class trapping_rain_water {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

      int left = 0, right = height.length - 1; // Pointers to the left and right ends
      int leftMax = 0, rightMax = 0; // Track the maximum height on the left and right
      int waterTrapped = 0;

      while (left < right) {
          if (height[left] < height[right]) {
              // Water is trapped based on the left boundary
              if (height[left] >= leftMax) {
                  leftMax = height[left]; // Update the left maximum
              } else {
                  waterTrapped += leftMax - height[left]; // Calculate trapped water
              }
              left++; // Move the left pointer inward
          } else {
              // Water is trapped based on the right boundary
              if (height[right] >= rightMax) {
                  rightMax = height[right]; // Update the right maximum
              } else {
                  waterTrapped += rightMax - height[right]; // Calculate trapped water
              }
              right--; // Move the right pointer inward
          }
      }

      return waterTrapped;
  }
}
