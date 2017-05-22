package Reverse_Words_in_a_String_III;

public class Solution {
    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String each : splited){
            sb.append(new StringBuilder(each).reverse().toString()+ " ");
        }
        
        return sb.toString().trim();
    }
}