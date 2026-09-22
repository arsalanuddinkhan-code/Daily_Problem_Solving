class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] a = new int[m][2];

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int x : mat[i])
                count += x;
            a[i][0] = count;
            a[i][1] = i;
        }

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (a[i][0] > a[j][0] ||
                   (a[i][0] == a[j][0] && a[i][1] > a[j][1])) {
                    int[] temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = a[i][1];

        return ans;
    }
}