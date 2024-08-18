class Solution {
    public String sortSentence(String s) {
        String[] res=s.split(" ");
        int n=res.length;
        String[] str=new String[n];
        int temp;
        for(int i=0;i<str.length;i++){
            temp=res[i].charAt(res[i].length()- 1)-'0';
            str[temp - 1] = res[i].substring(0, res[i].length()-1);
            }
            String r="";
            for(int i=0;i<str.length;i++){
                r=r+str[i];
                if(i!=str.length-1){
                    r=r+" ";
                }
            }

            
            return r;
    }
}
