class Solution {
    public static boolean[] isSieve(int n){
       boolean isprime[]= new boolean[n+1];
       for(int i=2;i*i<=n;i++){
          for(int j=i*i;j<=n;j+=i){
            isprime[j]=true;
          }
       }
       return isprime;
    }
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean prime[]=isSieve(n);
        int count=0;
        for(int i=2;i<n;i++){
            if(!prime[i]) count++;
        }
        return count;
    }
}