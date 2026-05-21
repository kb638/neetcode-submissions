class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();

        HashMap<Character,Character> hm=new HashMap<>();
        
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');

        for(char ch: s.toCharArray()){
            if(hm.containsKey(ch)){
                
                if(!st.isEmpty()&& st.peek()==hm.get(ch)){

                    st.pop();
                }

            
            else{
                return false;
            }
            }

            else{
                st.push(ch);
            }

            
        
        }


        return st.isEmpty();
    }
}
