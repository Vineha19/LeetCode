class Solution {
           
      public boolean isPalindrome(String str) {
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - i - 1)) {
            return false; 
        }
    }
    return true;
      }

    public String shortestPalindrome(String s) {
        int n=s.length();
        for(int i=n;i>0;i--){
             if(isPalindrome(s.substring(0,i))){
            StringBuilder sb=new StringBuilder(s.substring(i));
            String rev=sb.reverse().toString();
            return rev+s;
             }
        }
        return "";
    }
    }
    