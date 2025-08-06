// Last updated: 8/6/2025, 11:06:19 AM
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;

        for (int i = 0; i < seats.length; i++){
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }
}