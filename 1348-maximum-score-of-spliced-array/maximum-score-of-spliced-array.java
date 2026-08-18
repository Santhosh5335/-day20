class Solution {
  public int maximumsSplicedArray(int[] nums1, int[] nums2) {
    final int n = nums1.length;
    int sum1 = 0;
    int sum2 = 0;
    int maxEndHere1 = Integer.MIN_VALUE;
    int maxSoFar1 = 0;

    int maxEndHere2 = Integer.MIN_VALUE;
    int maxSoFar2 = 0;
    for (int i = 0; i < n; i++) {
      sum1 += nums1[i];
      sum2 += nums2[i];

      // kadane algorithm
      int diff = nums2[i] - nums1[i];
      maxSoFar1 = Math.max(diff, maxSoFar1 + diff);
      maxEndHere1 = Math.max(maxEndHere1, maxSoFar1);

      maxSoFar2 = Math.max(-diff, maxSoFar2 - diff);
      maxEndHere2 = Math.max(maxEndHere2, maxSoFar2);
    }

    return Math.max(maxEndHere1 + sum1, maxEndHere2 + sum2);
  }
}