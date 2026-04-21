class Solution {
    public int fib(int n) {
        if(n==0) return 0;

        int F0=0;
        int F1=1;
        int next=0;

        for(int i=2;i<=n;i++){
            next=F0+F1;
            F0=F1;
            F1=next;

        }
        return F1;
        
    }
}