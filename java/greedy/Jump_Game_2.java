public class Solution {
    public static int jump(int[] A) {
        int length= A.length;
        if(length==1) return 0;
        int flag=0;
        int max=0;
        int last=0;
        for(int i=0; i<length;i++){
            if(i>last){
                flag++;
                last=max;
            }
            if(A[i]+i>max){
                max=A[i]+i;
            }
            
        }
        return flag;
    }
}
