 public void sortColors(int[] A) {
        int left = 0;
        int right = A.length-1;
        int i=0;
        while(i<=right) {
            if(A[i]==0)
            {
                int temp = A[left];
                A[left] = A[i];
                A[i] = temp;
                left++;
                i++;
            }
            else
            if(A[i]==1) {
                i++;
            }
            else {
                int temp = A[right];
                A[right] = A[i];
                A[i] = temp;
                right--;
            }
         }
    }