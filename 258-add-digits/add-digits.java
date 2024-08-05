class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            int a=num%10;
            int b=num/10;
            num=a+b;
        }
        return num;
    }
}