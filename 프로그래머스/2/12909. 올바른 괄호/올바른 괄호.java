import java.util.*;
class Solution {
    boolean solution(String s) {
        int len = s.length();
        int cnt = 0;
        Queue<Character> q = new LinkedList<>();
        
        if(len % 2 != 0 || (Character) s.charAt(0) == ')' || s.charAt(len - 1) == '(') return false;
        
        for(char x : s.toCharArray()) q.offer(x);
        
        while(len > 0) {
            if(q.peek() == '(') {
                q.poll();
                cnt++;
            } 
            else {
                q.poll();
                cnt--;
            };
            
            if(cnt < 0) return false;
            
            len--;
        }
        
        if(cnt == 0) return true;
        else return false;
    }
}