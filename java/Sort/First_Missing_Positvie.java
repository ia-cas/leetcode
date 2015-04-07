 public int firstMissingPositive(int[] A) {
       
        int i = 0;
        while(i<A.length) {
            if(A[i]>0 && A[i]!=i+1 && A[i]<=A.length && A[i]!=A[A[i]-1]) {
                int temp = A[i];
                A[i] = A[A[i]-1];
                A[temp-1] = temp;
            }
            else {
               i++;
            }
        }
        for(int j=0;j<A.length;j++) {
            if(A[j]!=j+1) return j+1;
        }
        return A.length+1;
    }