class Solution {
    public boolean winnerOfGame(String colors) {
        // if (colors.length() < 4){
        //     return false;
        // }
        int alice = 0;
        int bob = 0;
        for (int i = 1; i < colors.length()-1; i++){
            char curr = colors.charAt(i);
            char prev = colors.charAt(i-1);
            char next = colors.charAt(i+1);

            if (curr == 'A' && prev == 'A' && next == 'A'){
                alice++;
            }
            else if (curr == 'B' && prev == 'B' && next == 'B'){
                bob++;
            }
        }

        return alice>bob;
    }
}