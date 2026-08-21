class Solution {
    public int[] countBits(int n) {
        int[] rez = new int[n + 1];

        while (n > 0) {
            rez[n] = bitCounter(n);
            n--;
        }

        return rez;
    }

    private int bitCounter(int num) {

        int count = 0;

        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }

        return count;
    }
}