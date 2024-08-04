public class Solution {
    public int reverse(int x) {
        long res = 0; // Use long to store the reversed integer
        while (x != 0) {
            res = res * 10 + x % 10; // Append the last digit to the reversed integer
            x /= 10; // Remove the last digit from the original integer
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0; // If the reversed integer is out of range, return 0
        }
        return (int) res; // Cast the result to int
    }
}