class Solution {
    public int coinChange(int[] coins, int amount) {
        int res = fun(coins,amount,0);
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int fun(int[]coins,int amount,int i){
        if(i>=coins.length){
            return Integer.MAX_VALUE;
        }
        if(amount == 0){
            return 0;
        }
        if(coins[i]>amount){
            return fun(coins,amount,i+1);
        }
        int choose = fun(coins,amount-coins[i],i);
        if(choose != Integer.MAX_VALUE){
            choose = 1 + choose;
        }
        int notChoose = fun(coins,amount,i+1);
        return Math.min(choose,notChoose);
    }
}
