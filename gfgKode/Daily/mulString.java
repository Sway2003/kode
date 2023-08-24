//use BigInteger for large multiplications




class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        
        BigInteger res = a.multiply(b);
        
        return res.toString();
    }
}
