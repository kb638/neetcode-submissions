class Solution {
    public int longestConsecutive(int[] nums) {
        //Identify the start of sequence by converting the array to hashset and checking if there is a n-1 for the first time. Later on keep on checkking n+1;

        HashSet<Integer> hs=new HashSet<>();

        for(int num:nums){
            
            hs.add(num);
        }

        int longest=0;

        for( int n:hs){

            if(!hs.contains(n-1)){
                int current =n;
                int length=1;
                while(hs.contains(current+1)){
                    current++;
                    length++;
                }

                longest=Math.max(length,longest);
            }
        }

        return longest;
    }
}
