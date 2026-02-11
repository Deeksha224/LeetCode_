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
    public int findMaximumXOR(int[] nums) {
        Trie t = new Trie();
        for (int x:nums){
            t.add(x);
        }
        int ans = 0;
        for (int x:nums){
            ans = Math.max(t.getMaxXor(x),ans);
        }
        return ans;   
    }
}