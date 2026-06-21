class Solution {
    public int maxIceCream(int[] costs, int coins) {
  
        int maxCost = 0;
        for (int cost : costs) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }

        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }
        
        int iceCreamBarsCount = 0;
        
        for (int price = 1; price <= maxCost; price++) {
            if (freq[price] == 0) {
                continue;
            }
            
            if (coins < price) {
                break;
            }
            
           
            int countToBuy = Math.min(freq[price], coins / price);
            
          
            coins -= countToBuy * price;
            iceCreamBarsCount += countToBuy;
        }
        
        return iceCreamBarsCount;
    }
}