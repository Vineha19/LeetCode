class Solution {
    public double myPow(double x, int n) {
        
       double ans = helper(x,(long) n); 
       return ans;
    }

    public double helper(double x, long n){
         if(n==0){
            return 1; 
        }
        if(n<0){
            n = -1*n; 
            x=1/x;
        }
        
        double ans = 1; 
        if(n%2==0){
           ans = helper(x*x, n/2); 
        }
        else{
            ans = x*helper(x*x, n/2); 
        }
    
       return ans;
    }
}