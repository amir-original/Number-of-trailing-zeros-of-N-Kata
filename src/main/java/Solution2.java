public class Solution2 {
    public int zeros(int n) {
        if (n / 5 == 0)
            return 0;
        return n / 5 + zeros(n / 5);
    }
}
