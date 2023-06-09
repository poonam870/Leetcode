/*
1672. Richest Customer Wealth
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

*/
//code
class Solution {
    public int maximumWealth(int[][] accounts) {
        int s[]=new int[accounts.length];
        int m;
        for(int i=0;i<accounts.length;i++){
            m=0;
            for(int j=0;j<accounts[i].length;j++){
                m+=accounts[i][j];
            }
            s[i]=m;
        }
       int res= Arrays.stream(s).max().getAsInt();

    return res; 
    }
}