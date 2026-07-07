class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int res = 0;
        int[] nc = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int a = Math.min(n, citations[i]);
            nc[a]++;
        }

        for (int j = n; j > 0; j--) {
            res = res + nc[j];

            if (res >= j) {
                return j;
            }
        }

        return 0;
    }
}
