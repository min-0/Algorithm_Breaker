class Solution {
    public String solution(String s) {
        String [] arr = s.split(" ", -1);
        String answer = "";
        String temp;
        
        for(int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr[i].length(); k++) {
                if(k % 2 == 0) {
                    temp = String.valueOf(arr[i].charAt(k));
                    answer += temp.toUpperCase();
                }
                else {
                    temp = String.valueOf(arr[i].charAt(k));
                    answer += temp.toLowerCase();
                }
            }
            if(i != arr.length - 1)answer += " ";
        }
        return answer;
    }
}