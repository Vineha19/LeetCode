class Solution {

    void fillLps(int[] lps,String pat) {
        int i=1;
        int prevLps = 0;

        while(i<lps.length){
            if(pat.charAt(i)==pat.charAt(prevLps)){
                prevLps++;
                lps[i] = prevLps;
                i++;
            }else{
                if(prevLps==0){
                    lps[i] = 0;
                    i++;
                }else
                    prevLps = lps[prevLps-1];
            }
        }
    }

    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int[] lps = new int[n]; 

        fillLps(lps,needle);

        int i=0;
        int j=0;

        while(i<m){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                if(j==0)
                    i++;
                else{
                    j = lps[j-1];
                }
            }
            if(j==n)
                return i-n;
        }
        return -1;
    }
}