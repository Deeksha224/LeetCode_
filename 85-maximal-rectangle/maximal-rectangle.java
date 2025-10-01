class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] arr = new int[matrix[0].length];
        int maxArea= 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    arr[j]+=1;
                }
                else{
                    arr[j] = 0;
                }
            }
            int area = largestRectangleArea(arr);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int len = heights.length; // as we are assuming val 0 at last index
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= len; i++){
            int val = (i==len) ? 0 : heights[i];
            while (!st.isEmpty() && val < heights[st.peek()]){
                int nsr = i; //next smaller right
                int tbs = st.pop(); //to be solved
                int nsl = -1; // next smaller left (is stack is empty we use -1)
                if (!st.isEmpty()){
                    nsl = st.peek();
                }
                int width = nsr - nsl -1;
                int height = heights[tbs];
                area = width*height;
                max = Math.max(max,area);
            }
            st.push(i);

        }
        return max;
    }
}