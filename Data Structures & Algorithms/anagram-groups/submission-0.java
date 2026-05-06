class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> hm=new HashMap<>();

        for(String str:strs){

            char[] cha=str.toCharArray();
            Arrays.sort(cha);
            String key= String.valueOf(cha);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList());
            }
            hm.get(key).add(str);

            
        }

        return new ArrayList(hm.values());

    }
}
