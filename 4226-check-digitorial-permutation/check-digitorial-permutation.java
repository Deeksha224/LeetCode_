class Solution {
    public boolean isDigitorialPermutation(int n) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int copy = n;
        int ans = 0;
        while(n>0){
            int temp = n%10;
            l1.add(temp);
            ans += fact(temp);
            n/=10;
        }
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        while(ans>0){
            int temp = ans%10;
            l2.add(temp);
            ans/=10;
        }
        if(l1.size()!=l2.size()) return false;
        Collections.sort(l1);
        Collections.sort(l2);
        for(int i = 0; i < l1.size(); i++){
            if(l1.get(i) != l2.get(i)) return false;
        }
        return true;
    }
    
    public int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}