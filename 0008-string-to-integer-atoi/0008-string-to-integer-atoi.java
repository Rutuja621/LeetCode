class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()) return 0;

        int sign=1;
        int i=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            if(s.charAt(0)=='-') sign= -1;
            i++;
        }
        long result=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result=result*10+(s.charAt(i)-'0');
            i++;

            if(sign * result <= Integer.MIN_VALUE)
               return Integer.MIN_VALUE;

            if(sign * result >= Integer.MAX_VALUE)
               return Integer.MAX_VALUE;
        }
        return (int) result * sign;
    }
}