public class Solution {
    public void merge(int A[], int m, int B[], int n) {
       if (m * n != 0) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            while(i>=0&&j>=0){
                if(A[i]>B[j]){
                    A[k]=A[i];
                    k--;
                    i--;
                }
                else if(A[i]<B[j]){
                    A[k]=B[j];
                    k--;
                    j--;
                }
                else if(A[i]==B[j]){
                    A[k]=A[i];
                    A[k-1]=B[j];
                    k=k-2;
                    i--;
                    j--;
                }
                if(i<0||j<0) break;
            }
            if(i<0){
                for(int a=j;a>=0;a--){
                    A[a]=B[a];
                }
            }
        }
        if(m==0) for(int d=0; d<n;d++){A[d]=B[d];}
    }
}
