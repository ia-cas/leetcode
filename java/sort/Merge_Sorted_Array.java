public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int cursor = m+n-1;
        int cursor_a = m-1;
        int cursor_b = n-1;
        while((cursor >= 0) && (cursor_a>=0) && (cursor_b>=0)){
            if(A[cursor_a] > B[cursor_b]){
                A[cursor] = A[cursor_a--];
            }
            else{
                A[cursor] = B[cursor_b--];
            }
            cursor--;
        }
        if(cursor_b >= 0){
            while(cursor >= 0){
                A[cursor] = B[cursor_b];
                cursor_b--;
                cursor--;
            }
        }
    }
}
