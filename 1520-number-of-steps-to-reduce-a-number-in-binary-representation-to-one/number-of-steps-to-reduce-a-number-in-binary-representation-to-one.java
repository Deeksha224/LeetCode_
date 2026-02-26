import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger a = new BigInteger(s,2);
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.valueOf(2);
        // System.out.println(a);
        int count = 0;
        while(!a.equals(one)){
            if(a.mod(two).equals(BigInteger.ZERO)){
                a = a.divide(two);
            }
            else{
                a = a.add(one);
            }
            count++;
        }
        return count;
    }
}