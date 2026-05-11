class Solution {
    public int[] separateDigits(int[] nums) {
        int totalLength=0;
        for (int num : nums) {
            totalLength += String.valueOf(num).length();
        }

        int []result= new int[totalLength];
        int k=0;
        for(int num:nums){
            String s=String.valueOf(num);
            for(int i=0;i<s.length();i++){
                result[k++]=s.charAt(i)-'0';

            }

        }
        return result;
    }
}