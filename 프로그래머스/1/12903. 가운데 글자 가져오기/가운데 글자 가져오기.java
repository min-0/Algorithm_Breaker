import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char [] arr = s.toCharArray();
        int len = s.length();
        
        if(len%2 == 0) {
            return String.valueOf(arr[len/2-1]) + String.valueOf(arr[len/2]);
        }
        else return String.valueOf(arr[len/2]);        
    }
}