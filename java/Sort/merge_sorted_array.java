 public void merge(int A[], int m, int B[], int n) {
        int pos = m+n-1;
		int apos = m-1;
		int bpos = n-1;
		while(apos>=0 && bpos>=0) {
			if(A[apos]>=B[bpos]) {
				A[pos] = A[apos];
				apos--;
			}
			else {
				A[pos] = B[bpos];
				bpos--;
			}
			pos--;
		}
		while(apos>=0) {
			A[pos] = A[apos];
			pos--;
			apos--;
		}
		while(bpos>=0) {
			A[pos] = B[bpos];
			pos--;
			bpos--;
		}
    }