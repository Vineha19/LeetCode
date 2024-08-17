class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<str.length;i++){
        str[i]=nums[i]+"";
        }
        Arrays.sort(str,new Comparator<String>(){
        @Override
        public int compare(String a,String b){
        String s1=a+b;
        String s2=b+a;
        return s2.compareTo(s1);
        }
    });
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String n:str){
            sb.append(n);
        }

      return sb.toString();
        
    }
}