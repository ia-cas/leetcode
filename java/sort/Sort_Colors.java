public class Solution {
    public void sortColors(int[] A) {
        int r=0;
        int w=0;
        int b=0;
        for(int i=0; i<A.length;i++){
            if(A[i]==0) r++;
            else if(A[i]==1) w++;
            else if(A[i]==2) b++;
        }
        for(int j=0; j<r+w+b; j++){
            if(j<r) A[j]=0;
            else if(j>=r&&j<r+w) A[j]=1;
            else if(j>=r+w&&j<r+w+b) A[j]=2;
        }
    }
}
