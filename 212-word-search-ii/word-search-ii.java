class Solution {
    static ArrayList<String> l;
    static class Trie{
        class Node{
            char ch;
            String isterminal;
            HashMap<Character,Node> child;
            public Node(char ch){
                this.ch = ch;
                child = new HashMap<>();
            }
        }
        Node root = new Node('*');
        public void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)){
                    curr = curr.child.get(ch);
                }
                else{
                    Node nn = new Node(ch);
                    curr.child.put(ch,nn);
                    curr = nn;
                }
            }
            curr.isterminal = word;
        }
        public void Search(char[][] board, int i, int j, Node node){
            if (i<0 || j<0 || i>=board.length || j>=board[0].length || !node.child.containsKey(board[i][j])){
                return;
            }
            char ch = board[i][j];
            node = node.child.get(ch);
            if (node.isterminal!= null){
                l.add(node.isterminal);
                node.isterminal=null;
            }
            board[i][j] = '*';
            Search(board,i+1,j,node);
            Search(board,i-1,j,node);
            Search(board,i,j+1,node);
            Search(board,i,j-1,node);
            board[i][j] = ch;
        }

    }
    public List<String> findWords(char[][] board, String[] words) {
        Trie t = new Trie();
        l  = new ArrayList<>();
        for(String s: words){
            t.insert(s);
        }
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(t.root.child.containsKey(board[i][j])){
                    t.Search(board,i,j,t.root);
                }
            }
        }
        return l;
    }

    
}