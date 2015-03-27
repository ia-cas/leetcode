public class Solution {
    public int jump(int[] A) {
        int maxCover = 0;  
		 int num=0;
	    while(maxCover<A.length-1) {
	    	int bj = 0;
	    	int max = 0;
	    	int bj_step = 0;
	    	for(int i=1;i<=A[maxCover];i++) {
	    		if(maxCover+A[maxCover]>=A.length-1) {
		    		   num++;
		    		   bj=1;
		    		   break;
		    	   }
	    		else
	    	   if(maxCover+i+A[maxCover+i]>=A.length-1) {
	    		   num=num+2;
	    		   bj=2;
	    		   break;
	    	   }
	    	   else {
	    		   if(maxCover+i+A[maxCover+i]>max) {
	    			   max = maxCover+i+A[maxCover+i];
	    			   bj_step = i;
	    		   }
	    	   }
	    	   
	    	}
	    	if(bj>0) break;
	    	maxCover = maxCover+bj_step;
	    	num++;
	    }
	    
	    return num;
    }
}
