class Solution {
    public int romanToInt(String s) {
        int total=0;
        int prevValue=0;


        for(int i=s.length()-1;i>=0;i--){
            int currentVal=0;


            switch(s.charAt(i)){
                case 'I' -> currentVal=1;
                case 'V' -> currentVal = 5;
                case 'X' -> currentVal = 10;
                case 'L' -> currentVal = 50;
                case 'C' -> currentVal = 100;
                case 'D' -> currentVal = 500;
                case 'M' -> currentVal = 1000;
            }

            if(currentVal < prevValue){
                total -=currentVal;
            }else{
                total += currentVal;
            }

            prevValue = currentVal;
        }

        return total;
    }
}