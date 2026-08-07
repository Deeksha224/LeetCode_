class Solution {
    public int beautySum(String s) {
        return count(fun(s));
    }

    public int count(ArrayList<String> list){
        int ans=0;
        for(String str : list){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int[] freq = new int[26];
            for(int i = 0; i < str.length(); i++){
                freq[str.charAt(i)-'a']++;
            }
            for(int f : freq){
                if(f > 0){
                    min = Math.min(min, f);
                    max = Math.max(max, f);
                }
             }
            //System.out.println(max+" min: "+ min);
            ans += (max-min);

        }
        return ans;
    }
    public ArrayList<String> fun (String s){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                if(j-i >= 3)
                    list.add(s.substring(i,j));
            }
        }

        //ArrayList<String> list = new ArrayList<>(set);
        // for(int i = 0; i < set.size(); i++){
        //     System.out.println(list.get(i));
        // }
        return list;
    }
}