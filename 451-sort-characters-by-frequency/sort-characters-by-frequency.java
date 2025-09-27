// class Solution {
//     public String frequencySort(String s) {
//         int n=s.length();
//         Map<Character, Integer> mp=new HashMap<>();
//         for(int i=0; i<n; i++){
//             mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
//         }
//         List<Map.Entry<Character, Integer>> ll=new ArrayList<>(mp.entrySet());

//         Collections.sort(ll,(a,b)->{
//             return b.getValue()-a.getValue();
//         });

//         StringBuilder sb=new StringBuilder();
//         for(Map.Entry<Character, Integer> i:ll){
//             char ch=i.getKey();
//             int t=i.getValue();
//             for(int j=0; j<t; j++){
//                 sb.append(ch);
//             }
//         }
//         return sb.toString();

//     }
// }





class Solution {
    public String frequencySort(String s) {

        int n=s.length();
        Map<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(mp.entrySet());

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> i=pq.poll();
            char ch=i.getKey();
            int t=i.getValue();
            for(int j=0; j<t; j++){
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}