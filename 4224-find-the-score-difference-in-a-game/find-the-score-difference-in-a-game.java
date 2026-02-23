class Solution {
    public int scoreDifference(int[] nums) {
        boolean c1 = true;
        boolean c2 = false;
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i < nums.length; i++){
            if((i+1)%6==0){
                if(c1){
                    c1=false;
                    c2=true;
                }
                else{
                    c1=true;
                    c2=false;
                }
            }
            if(nums[i]%2!=0){
                if(c1){
                    c1=false;
                    c2=true;
                }
                else{
                    c1=true;
                    c2=false;
                }
            }
            if(c1) p1+=nums[i];
            if(c2) p2+=nums[i];
        }
        return p1-p2;
    }
}