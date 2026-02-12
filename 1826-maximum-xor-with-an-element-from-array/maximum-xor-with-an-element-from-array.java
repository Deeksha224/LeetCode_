class Solution {
    static class Trie{
        class Node {
            Node zero;
            Node one;
        }
        private Node root = new Node();

        public void add(int val){
            Node curr = root;
            for (int i = 31; i >=0; i--){
                int bit = val & (1 << i); //bit will be 0 or 1
                // int bit = (val >> i) & 1;
                if(bit==0){
                    if(curr.zero!=null){
                        curr = curr.zero;
                    }
                    else{
                        Node nn = new Node();
                        curr.zero = nn;
                        curr = nn;
                    }
                }
                else{
                    if(curr.one!=null){
                        curr = curr.one;
                    }
                    else{
                        Node nn = new Node();
                        curr.one = nn;
                        curr = nn;
                    }
                }
            }
        }
        public int getMaxXor(int x){
            int ans = 0;
            Node curr = root;
            for (int i = 31; i >= 0; i--){
                int bit = x & (1 << i);
                // int bit = (x >> i) & 1;

                if (bit == 0){
                    if(curr.one!=null){
                        ans = ans | (1<<i);  //(can work or, xor, +)
                        curr = curr.one;
                    }
                    else{
                        curr = curr.zero;
                    }
                }
                else{
                    if(curr.zero!=null){
                        curr = curr.zero;
                        ans = ans | (1<<i);  //(can work or, xor, +)
                    }
                    else{
                        curr = curr.one;
                    }
                }
            }
            return ans;
        }
    }

    public int[] maximizeXor(int[] nums, int[][] queries) {
        int[][] q = new int[queries.length][3];
        for(int i = 0; i < q.length;i++){
            q[i][0] = queries[i][0]; //xi
            q[i][1] = queries[i][1]; //mi
            q[i][2] = i; //index
        }
        Arrays.sort(q,(a,b) -> a[1]-b[1]); //sort on bases of mi
        Arrays.sort(nums);

        Trie t = new Trie();
        int[] ans = new int[q.length];
        int j = 0; //index
        for (int[] a:q){
            while(j < nums.length && nums[j] <= a[1]){
                t.add(nums[j]);
                j++;
            }
            if(j==0){
                ans[a[2]] = -1;
            }
            else{
                ans[a[2]] = t.getMaxXor(a[0]);
            }
        }
        return ans;
        
    }
}