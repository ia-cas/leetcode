public class Solution {
    public boolean canJump(int[] A) {
        int maxCover = 0;  
		    for(int start = 0; start<=maxCover && start<A.length;start++){  
		        if(A[start]+start > maxCover)  
		            maxCover = A[start]+start;  
		        if(maxCover >=A.length-1)  
		            return true;  
		    }  
		
		return false;	
    }
}
