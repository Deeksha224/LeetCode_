// Last updated: 8/6/2025, 11:08:36 AM
class Solution {
    public int maximumSwap(int num) {
	    List<Integer> li = new ArrayList<>();
        while(num>0){
            li.add(num%10);
            num/=10;
        }
        return answer(li,li.size(),0);
    }
    public int answer(List<Integer> li,int end,int c){
        if(end==1){
            int ans=0;
            for(int i=li.size()-1 ;i>=0;i--){
                ans = ans*10+ li.get(i);
            }
            return ans;
        }
        int max = Integer.MIN_VALUE;
        int ind=0;
        for(int i=0 ; i<end ; i++){
            if(li.get(i)>max){
                max = li.get(i);
                ind = i;
            }
        }
        if(ind==end-1 || li.get(ind)==li.get(end-1)){
            return answer(li,end-1,c+1);
        }else{
            int ans=0;
            int tep = li.get(li.size()-1-c);
            li.set(li.size()-1-c,li.get(ind));
            li.set(ind,tep);
            for(int i=li.size()-1 ;i>=0;i--){
                ans = ans*10+ li.get(i);
            }
            return ans;
        }
    }
}