class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n의 약수 중 홀수인 수의 개수가 정답
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                if(i % 2 == 1) answer++;
            }
        }
        
        return answer;
    }
}