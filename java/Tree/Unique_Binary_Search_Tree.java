package week4;

public class Unique_Binary_Search_Tree {

	public static int numTrees(int n) {
		if(n==0) return 0;
		else
		if(n==1) return 1;
		else
		if(n==2) return 2;
		int[] result = new int[n+1];
		result[0] = 1;
		result[1] = 1;
		result[2] = 2;
		for(int i=3;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				result[i] += result[j-1]*result[i-j]; 
			}
		}
		return result[n];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(5));
	}

}
