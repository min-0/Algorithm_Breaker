class Solution {
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }
    public int solution(int[] arr) {
        int answer = 0;
        int gcdNum = arr[0];
        int lcmNum = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            gcdNum = gcd(gcdNum, arr[i]);
            lcmNum = lcm(lcmNum, arr[i]);
        }
        answer = lcmNum;
        
        return answer;
    }
}