package Week3_Sort;

/**
 * Author: thunderlbc
 * Date:   15-4-9
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_1_MergeSortedArray {


    public void merge(int[]A, int m, int[] B, int n){
        int curA = m - 1;
        int curB = n - 1;
        for (int curWhole = m + n - 1; curWhole >= 0  ; curWhole --){
            //Slotting starts from the end of the A array.
            if (curA >= 0 && curB >= 0) {
                A[curWhole] = A[curA] > B[curB]? A[curA--]:B[curB--];
            }else{
                if(curB < 0){
                    return;
                }else{
                    while(curB >= 0){
                        A[curB] = B[curB];
                        curB --;
                    }
                }
            }
        }
    }

    public static void main(String[]args){
        int[] A = {1,0};
        int[] B = {2};
        LeetCode_1_MergeSortedArray lcmsa = new LeetCode_1_MergeSortedArray();
        lcmsa.merge(A, A.length-B.length, B, B.length);
        for (int i = 0; i < A.length; i++) {

            System.out.println(A[i]);
        }
    }
}
