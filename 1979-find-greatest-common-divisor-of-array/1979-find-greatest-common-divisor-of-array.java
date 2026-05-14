class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int s:nums){
            if(s<min) min=s;
            if(s>max) max=s;

        }

        while(max % min !=0){
            int rem=max % min;
            max=min;
            min=rem;

        }
        return min;

        
    }
}