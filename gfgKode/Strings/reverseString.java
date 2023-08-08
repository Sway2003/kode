// as string is immutable convert into StringBuffer Object return using reverse() method call

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        
        return sb.toString();
    }
}
