class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] p = { p1, p2, p3, p4 };
        Arrays.sort(p, (l1, l2) ->
            l2[0] == l1[0] ? l1[1] - l2[1] : l1[0] - l2[0]
        );
        return (
            dist(p[0], p[1]) != 0 &&
            dist(p[0], p[1]) == dist(p[1], p[3]) &&
            dist(p[1], p[3]) == dist(p[3], p[2]) &&
            dist(p[3], p[2]) == dist(p[2], p[0]) &&
            dist(p[0], p[3]) == dist(p[1], p[2])
        );
    }
    public double dist (int[] p1, int[] p2){
        double temp = 0;
        int a1 = p1[0];
        int a2 = p2[0];
        int b1 = p1[1];
        int b2 = p2[1];
        double s1 = Math.pow((a1-a2),2);
        double s2 = Math.pow((b1-b2),2);
        temp = Math.sqrt(s1+s2);

        return temp;
    }
}