class Example2 {
    public int arrangeCoins(int n) {
        int ans = 1;
    while(n > 0){
      ans++;
      n = n-ans;
    }
    return ans-1;
    }
}