/*
2574. Left and Right Sum Differences
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].


*/
//code
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int s[]=new int[n];
        l[0]=0;
       // l[1]=nums[0];
        for(int i=1;i<n;i++){
            l[i]=l[i-1]+nums[i-1];
        }
        r[n-1]=0;
        for(int i=n-2;i>=0;i--){
            r[i]=r[i+1]+nums[i+1];
           
           
        }
        
        for(int i=0;i<n;i++){
            s[i]=Math.abs(l[i]-r[i]);
        }
        return s;
    }
}