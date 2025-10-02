class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                // if same height, sort by position (small k first)
                return a[1] - b[1];
            } else {
                // else, taller person comes first
                return b[0] - a[0];
            }
        });

        List<int[]> list = new ArrayList<>();
        for (int[] arr : people) {
            // put each person at index = k
            list.add(arr[1], arr);
        }
        return list.toArray(new int[people.length][2]);
    }
}
