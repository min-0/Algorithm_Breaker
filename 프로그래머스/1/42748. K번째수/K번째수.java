import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int [] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            arrayList.add(temp[commands[i][2]-1]);
        }
        Integer[] integerArr = arrayList.toArray(new Integer[arrayList.size()]);
        int[] answer = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}