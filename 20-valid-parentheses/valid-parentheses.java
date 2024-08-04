class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char arr[] = s.toCharArray();
        for(char ch : arr){
            if(ch == '(')
            stack.push(')');
            else if(ch == '[')
            stack.push(']');
            else if(ch == '{')
            stack.push('}');
            else if(stack.isEmpty() || stack.pop()!= ch)
            return false;
        }
        return stack.isEmpty();
    }
}
