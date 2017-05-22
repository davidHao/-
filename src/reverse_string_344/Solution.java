package reverse_string_344;


public class Solution {
    public String reverseString(String s) {
    
    StringBuilder sb = new  StringBuilder(s);
    
    sb = sb.reverse();
        
    return sb.toString();
    }
}