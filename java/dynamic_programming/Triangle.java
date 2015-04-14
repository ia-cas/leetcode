public class Solution {
   public int minimumTotal(List<List<Integer>> triangle) {
        int temp=0;
        int m = triangle.size();
        int[][] step = new int[m][m];
        step[0][0]=triangle.get(0).get(0);
        if(m==1){temp=step[0][0];}
        if(m>1) {
            step[1][0] = triangle.get(0).get(0) + triangle.get(1).get(0);
            step[1][1] = triangle.get(0).get(0) + triangle.get(1).get(1);
            if(step[1][0]>step[1][1]){temp=step[1][1];}
            else{temp=step[1][0];}
        }

        if(m>2) {
            for (int i = 2; i < m; i++) {
                step[i][0]=step[i-1][0]+triangle.get(i).get(0);
                step[i][i]=step[i-1][i-1]+triangle.get(i).get(i);
                for (int j = 1; j < i; j++) {
                    if(step[i-1][j-1]<step[i-1][j]){
                        step[i][j]=step[i-1][j-1]+triangle.get(i).get(j);
                    }
                    else{
                        step[i][j]=step[i-1][j]+triangle.get(i).get(j);
                    }
                }
            }

        temp=step[m-1][0];
        for(int n=1; n<m; n++){
            if(step[m-1][n]<temp){temp = step[m-1][n];}
        }
        }
        return temp;
}
}
