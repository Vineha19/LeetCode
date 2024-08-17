/*class Solution {
    public String reverseWords(String s) {
        char ch[]=s.toCharArray();
        int a=0,b=s.length()-1;
        while(a<b){
            char temp=ch[a];
            ch[a]=ch[b];
            ch[b]=temp;
            a++;
            b--;
        }
        return new String(ch);
    }
}*/
class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split("\\s+"); 
        String str = "";
        for(int i = words.length - 1; i > 0; i--){
            str += words[i] + " ";
        }
        return str + words[0];
    }
}