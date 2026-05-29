class Solution {
    public int minElement(int[] nums) {
        int minVal=Integer.MAX_VALUE;
    
        for(int num:nums){
            int temp=num;
            int sum=0;

            while(temp>0){
                int digit=temp%10;
                sum+=digit;
             
                temp/=10;

            }

            minVal=Math.min(minVal,sum);

        }
        return minVal;
    }
}