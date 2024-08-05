class Solution {
    public String reverseWords(String s) {
        String s1="";
        String[] words=s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            s1=s1+words[i]+" ";

        }
        return s1.trim();
    }
}