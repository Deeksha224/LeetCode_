class Solution {
    public int countTrapezoids(int[][] points) { 
        //storing the frequency of y axis points in hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] point: points){
            int p = point[1];
            map.put(p,map.getOrDefault(p,0)+1);
        }

        // possible combinations nCr
        ArrayList<Long> l = new ArrayList<>();
        for (long c : map.values()){
            if (c >= 2){
                long ans = c * (c-1) / 2;
                l.add(ans);
            }
        }
        int mod=1000000007;
        long sum = 0;
        for (long val: l){
            sum = (sum+val)%mod;
        }
        //System.out.print(sum);
        
        long res = 0;
        for (long val: l){
            sum = (sum - (val % mod)) % mod;
            res = (res + (val % mod) * sum) % mod;
        }
        return (int)res;
    }
}