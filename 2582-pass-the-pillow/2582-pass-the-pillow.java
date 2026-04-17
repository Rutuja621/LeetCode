class Solution {
    public int passThePillow(int n, int time) {
        int cycleTime=(n-1)*2;
        int remainingTime=time % cycleTime;

        if(remainingTime < n){
            return 1 + remainingTime;

        }else{
            return n-(remainingTime-(n-1));
        }
        
    }
}