Time Complexity --> O(n)
Space Complexity --> O(n)

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int B[]= new int[n];
        for(int i=n-1;i>=0; i--){
            if (prices[i]>max){
                max=prices[i];
                B[i]=max;
            }
            else{
                B[i]=max;
            }
        }
        int diff=0;
        int max_diff=0;
        for(int i=0; i<n;i++){
            diff=B[i]-prices[i];
            if(diff>max_diff){
                max_diff=diff;
            }
        }
        return max_diff;}}
