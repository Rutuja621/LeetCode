class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMas=mass;


        for(int asteroid : asteroids){
            if(currMas < asteroid)
                return false;

            currMas +=asteroid;
            
        }
        return true;
    }
}