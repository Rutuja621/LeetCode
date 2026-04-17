class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(j==nums[i]){
                j++;

            }

        }
        return j;


    }
}
