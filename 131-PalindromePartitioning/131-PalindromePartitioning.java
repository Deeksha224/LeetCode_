// Last updated: 8/6/2025, 11:11:15 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ll = new ArrayList<>();
        partition(s,new ArrayList<>(), ll);
        return ll;
    }
    public static void partition (String ques,List<String> li,List<List<String>> ll){
        if (ques.length() == 0){
            ll.add(new ArrayList<>(li));
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++){
            String s = ques.substring(0,cut);
            if (ispalindrome(s)) {
                li.add(s);
                partition(ques.substring(cut),li,ll);
                li.remove(li.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String s){
        int start=0,end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}