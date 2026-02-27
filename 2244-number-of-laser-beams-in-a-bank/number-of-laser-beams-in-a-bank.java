class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int total = 0;
        for(String s:bank){
            int curr = 0;
            for(char a : s.toCharArray()){
                if(a =='1'){
                    curr++;
                }
            }
            if(curr>0){
                total += curr*prev;
                prev = curr;
            }
        }
        return total;
    }
}

// class Solution {
//     public int numberOfBeams(String[] bank) {
//         ArrayList<Integer> count = new ArrayList<>();
//         for(int i = 0; i < bank.length; i++){
//             if(one(bank[i]) != 0){
//                 count.add(one(bank[i]));
//             }
//         }  
//         if(count.size() == 1) return 0;
//         int sum = 0;
//         for(int i = 1; i < count.size(); i++){
//             sum = sum + (count.get(i-1)*count.get(i));
//         }
//         return sum;
//     }
//     public int one(String a){
//         return a.length()-a.replaceAll("1","").length();
//     }
// }