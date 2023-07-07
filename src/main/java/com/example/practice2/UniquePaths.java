package com.example.practice2;

public class UniquePaths {

	public static int uniquePaths(int m, int n) {
		int[][] db = new int[m][n];

		for(int i=0;i<db[0].length;i++){
			db[0][i]=1;
		}

		for(int j=0;j<db.length;j++){
			db[j][0] = 1;
		}

		for(int i=1;i<db.length;i++){
			for(int j=1;j<db[0].length;j++){
				db[i][j] = db[i-1][j]+db[i][j-1];
			}
		}

		return db[m-1][n-1];
	}
	
	public static void main(String[] args) {
		int[][] A= { { 0, 0, 0 },
                   	 { 0, 1, 0 },
                   	 { 0, 0, 0 } };
		System.out.println(uniquePaths(3, 3));

	}
}


