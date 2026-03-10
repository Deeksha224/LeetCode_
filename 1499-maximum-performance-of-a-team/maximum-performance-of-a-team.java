class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int mod = 1000000007;
        int arr[][] = new int[n][2];
        // store efficiency and speed together
        for(int i = 0; i < n; i++){
            arr[i][0] = efficiency[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a,b) -> b[0] - a[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap for speeds
        long sumSpeed = 0;
        long maxPerformance = 0;

        for(int i = 0; i < n; i++){

            int currEfficiency = arr[i][0];
            int currSpeed = arr[i][1];

            pq.add(currSpeed);
            sumSpeed += currSpeed;

            if(pq.size() > k){
                sumSpeed -= pq.poll();
            }
            long ans = sumSpeed * currEfficiency;

            maxPerformance = Math.max(maxPerformance, ans);
        }

        return (int)(maxPerformance % mod);
    }
}