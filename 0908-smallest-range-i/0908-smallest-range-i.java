class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mx=nums[0] ,mn=nums[0];
        for(int a:nums){
            mx=Math.max(mx,a);
            mn=Math.min(mn,a);

        }
        return Math.max(0,mx-mn-2*k);
    }
}