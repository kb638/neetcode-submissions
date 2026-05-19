class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int i=0;
        int j=heights.length-1;

        while(i<j){

            if(heights[i]<heights[j]){
                maxArea=Math.max(maxArea,heights[i]*(j-i));
                i++;
            }
            else{
                  maxArea=Math.max(maxArea,heights[j]*(j-i));
                
                j--;
            }
        }
 
    return maxArea;
    }
}
