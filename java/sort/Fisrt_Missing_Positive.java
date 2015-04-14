public class Solution {
    public int firstMissingPositive(int[] A) {
            if(A==null) return 1;
        int length = A.length;
        for (int i = 0; i < length; i++) {
            while(A[i]!=i+1) {
            if(A[i]>length||A[i]<=0||A[i]==A[A[i]-1]) break;
            else {
                int temp;
                temp=A[i];
                A[i]=A[A[i]-1];
                A[temp-1]=temp;
                }
            }
        }
        int j = 0;
        for(; j<length; j++){
            if (A[j]!=j+1) {
                break;
            }
            else continue;
        }
        return j+1;
    }
}
