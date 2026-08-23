class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int q1 = countQues(num.substring(0,n/2));
        int q2 = countQues(num.substring(n/2));
        int diff = q2-q1;
        int s1 = (sum(num.substring(0,n/2)));
        int s2 = (sum(num.substring(n/2)));

        if((q1+q2) % 2 == 1) return true;
        return 2 * (s1 - s2) != 9 * (q2 - q1); 
        
        // System.out.println(q1+" "+ q2);
        // System.out.println(diff);
        // System.out.println(count1+" "+ count2);
        //return true;
    }
    public int countQues(String num1){
        int count = 0;
        for(char ch : num1.toCharArray()){
            if(ch=='?') count++;
        }
        return count;
    }
    public int sum(String num){
        char[] num1 = num.toCharArray();
        int count = 0;
        for(int i = 0; i < num1.length; i++){
            if(num1[i] == '?') continue;
            else
                count = count + (num1[i]-'0');
        }
        return count;
    }
}