class Solution {
    int[]cache;
    public int climbStairs(int n) {
        cache = new int[n];
        Arrays.fill(cache,-1);
        return fun(n,0);
    }
    public int fun(int n,int i){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(cache[i]!=-1){
            return cache[i];
        }
        int choose1 = fun(n,i+1);
        int choose2 = fun(n,i+2);
        cache[i] = choose1+choose2;
        return cache[i];
    }
}