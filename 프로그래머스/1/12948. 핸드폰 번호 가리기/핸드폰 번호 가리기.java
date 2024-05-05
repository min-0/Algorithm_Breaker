class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String lastNum = phone_number.substring(len-4);
        
        phone_number = phone_number.substring(0, len-4).replaceAll("[0-9]", "*");
        answer = phone_number + lastNum;
        
        return answer;
    }
}