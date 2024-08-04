class Solution {
    /*
    O(log(Quotient)) O(1)
    Quotient is nothing but how many times can we subtract divisor
    from diviend until divident becomes < 0
    Instead of subracting by divisor, we'll subtract by divisor*2^x
    We'll subtract by highest possible power of 2 multiplied by divisor
    eg. divisor*2^1, divisor*2^2, divisor*2^3, which ever is highest possible
    Then for the remaining number, we again do the same thing 
    And finally return all the 2^x s , as we substracted divisor those many times
    */
    public int divide(int dividend, int divisor) {
        // check for overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        // if only one of the 2 numbers is negative, res will be negative
        boolean resNegative = false;
        if ((dividend < 0 && divisor < 0) == false && (dividend < 0 || divisor < 0) == true) {
            resNegative = true;
        }   
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        int quotient = 0;
        while (dividend - divisor >= 0) {
            int x = 0; // x is highest of power 2 such that divisor*(2^x) can be subtracted
            while (dividend - (divisor << 1 << x) >= 0) {
                x++; // go for higher power
            }
            // incresase quotient by highest power found
            quotient += 1 << x;
            // follow the same for the remaining number
            dividend -= divisor << x;
        }
        return resNegative ? -quotient : quotient;
    }
}