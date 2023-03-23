/*
1929. Concatenation of Array

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

*/
//code

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int k=2*n;
        int [] ans=new int[k];
       int pos=0;
       for(int i:nums){
           ans[pos]=i;
           pos++;
       }
       for(int j:nums){
           ans[pos]=j;
           pos++;
       }
     return ans;     
    }
}