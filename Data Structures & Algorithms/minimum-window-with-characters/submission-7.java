class Solution {
    public String minWindow(String s, String t) {
        

        int[] mapS=new int[128];
        int[] mapT=new int[128];

        int l=0;
        int minlen=Integer.MAX_VALUE;
        int minstart=0;
        
        for(char ch:t.toCharArray()){
            mapT[ch]++;
        }

        for(int r=0;r<s.length();r++){

            mapS[s.charAt(r)]++;

            while(contains(mapS,mapT)){

                if(r-l+1<minlen){
                    minlen=r-l+1;
                    minstart=l;
                }

                mapS[s.charAt(l)]--;
                l++;
            }

            

        }
return minlen==Integer.MAX_VALUE?"":s.substring(minstart,minlen+minstart);

    }

            boolean contains( int[] mapS, int [] mapT){

            for(int i=0;i<128;i++){

                if(mapT[i]>mapS[i]){
                    return false;
                }
            }
            return true;
        }
}
