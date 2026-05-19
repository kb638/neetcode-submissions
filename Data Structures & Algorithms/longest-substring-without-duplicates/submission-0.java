class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int maxlen=0;
        int length=0;

        int end =0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while( end<s.length()){

            if(hm.containsKey(s.charAt(end))&& hm.get(s.charAt(end))>=start){
                start=hm.get(s.charAt(end))+1;
                hm.put(s.charAt(end),end);
            }   
            length=end-start+1;
            hm.put(s.charAt(end),end);
            maxlen=Math.max(maxlen,length);
            end++;

        }

        return maxlen;

    }
}
