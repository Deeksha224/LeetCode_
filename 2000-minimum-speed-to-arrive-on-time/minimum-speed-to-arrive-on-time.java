class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start = 1;
        int end = 1000000000;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (isPossible(dist,mid,hour)){
                end = mid - 1;
                ans = mid;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        
    }
    public boolean isPossible(int[] dist, int mid, double hour){
        double count = 0.0;
        for (int i = 0; i < dist.length - 1; i++){
            count += Math.ceil((double)dist[i]/mid);

            //System.out.println(count+"/");
        }
        count += (double)dist[dist.length-1]/mid;
        //System.out.println(count+"g");
        return count <= hour;
    }
}