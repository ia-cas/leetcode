public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int re = 0;
        int row = triangle.size();
        int[] sum = new int[2*row - 1];
        sum[0] = triangle.get(0).get(0);
        int first = 0;
        int last = 0;
        for(int i = 1; i < row; ++i){
            List<Integer> lis = triangle.get(i);
            int col = lis.size();
            for(int j = 0; j < col; ++j){
                int left = j-1>=0 ? sum[i - 2<0 ? 0:(((i-1)*(i)/2 + j-1)%(2*row - 1))]:1000000;
                int right = j==col-1 ? 1000000:sum[i - 2<0 ? 0:(((i-1)*(i)/2 + j)%(2*row - 1))];
                int pos = ((i + 1)*i/2 + j);
                sum[ pos%(2*row - 1)] = triangle.get(i).get(j) + (left>right?right:left);
                last ++;
                if(last >= 2*row - 1){
                    last = 0;
                }
            }
        }
        re = sum[last];
        for(int k = 1; k < row; k ++){
            last --;
            if(last < 0)
                last = 2*row - 2;
            re = sum[last]>re ? re:sum[last];
        }
        return re;
    }
}
