public class Solution {
    public int zeros(int number) {
        int numberOfZeros = 0;
        for (int i = 5; i <= number; i *= 5)
            for (int j = i; j <= number; j += i)
                numberOfZeros++;
        return numberOfZeros;
    }

}
    /*    for (int i = 5; i <= number; i += 5) {
            result++;
        }
        for (int i = 25; i <= number; i += 25) {
            result++;
        }

        for (int i = 125; i <= number; i += 125) {
            result++;
        }

        for (int i = 625; i <= number; i += 625) {
            result++;
        }*/
