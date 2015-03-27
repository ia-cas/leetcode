public class Solution {
    public int climbStairs(int n) {
          int var=0;
		if(n<3) {
			var = n;
		}
		else {
			int a1=1,a2=2;
			for(int i=3;i<=n;i++) {
				int a3= a1+a2;
				a1=a2;
				a2=a3;
				var=a3;
			}
			
		}
		
		return var;
    }
}
