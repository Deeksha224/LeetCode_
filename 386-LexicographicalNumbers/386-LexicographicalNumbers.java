// Last updated: 8/6/2025, 11:09:35 AM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        print(n,0,res);
        return(res);
    }

    public static void print(int n , int curr, List<Integer> res){
        if (curr > n){
            return;
        }
        else{
            if (curr != 0){
                res.add(curr);
            }
        }
        int i = 0;
        if (curr == 0){
            i = 1;
        }
        for (; i <=9; i++){
            print(n,curr * 10+i, res);
        }
    }
}