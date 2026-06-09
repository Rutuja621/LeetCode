class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){

                boolean leftClear = (i == 0 || flowerbed[i-1] == 0);
                boolean rightClear=(i == flowerbed.length -1 || flowerbed[i+1] ==0);

                if(leftClear && rightClear){
                    flowerbed[i] =1;
                    n--;
                if(n == 0){
                    return true;

                }
                }


              

            }

        }
        return false;
    }
}