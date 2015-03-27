public class Solution {
    public static boolean canJump(int[] A) {
            int length = A.length;
            if (A[0] >= length - 1) return true;
            else {
                int max = 0;
                for (int i = 0; i <= max && max < length - 1; i++) {
                    if (A[i] + i > max) max = A[i] + i;
                    if(max >= length-1) return true;
                }
            }
            return false;
        }
}
