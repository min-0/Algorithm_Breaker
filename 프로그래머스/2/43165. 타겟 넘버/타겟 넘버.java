class Solution {
    int sum = 0;
    int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, sum, 0);
        return answer;
    }
    public void DFS(int[] numbers, int target, int sum, int i) {
        if(i == numbers.length) {
            if(sum == target) answer++;
            return;
        }
        
        int plus = sum + numbers[i];
        int minus = sum - numbers[i];
        DFS(numbers, target, plus, i+1);
        DFS(numbers, target, minus, i+1);
            
    }
    
}