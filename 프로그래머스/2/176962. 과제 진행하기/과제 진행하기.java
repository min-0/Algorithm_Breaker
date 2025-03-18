import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = {};
        ArrayList<String> array = new ArrayList<>();
        Stack<HashMap<String, Integer>> stack = new Stack<>();
        
        for(int i = 0; i < plans.length; i++) {
            plans[i][1] = plans[i][1].replace(":", "");
        }
        Arrays.sort(plans, (o1, o2) -> o1[1].compareTo(o2[1]));
        
        for (int i = 0; i < plans.length; i++) {
            int time = (Integer.parseInt(plans[i][1]) / 100) * 60 + (Integer.parseInt(plans[i][1]) % 100);
            int spend = Integer.parseInt(plans[i][2]);

            if (i == plans.length - 1) { // 마지막 과제는 무조건 수행 완료
                array.add(plans[i][0]);
            } else {
                int next = (Integer.parseInt(plans[i + 1][1]) / 100) * 60 + (Integer.parseInt(plans[i + 1][1]) % 100);
                
                if ((time + spend) > next) { // 시간이 부족하면 미완료 상태로 저장
                    HashMap<String, Integer> map = new HashMap<>();
                    map.put(plans[i][0], (time + spend) - next);
                    stack.push(map);
                } else { // 충분하면 수행 완료
                    array.add(plans[i][0]);

                    int remainTime = next - (time + spend); // 남은 시간
                    while (!stack.isEmpty() && remainTime > 0) { // 남은 시간 동안 미완료 과제 수행
                        HashMap<String, Integer> unfinished = stack.pop();
                        String task = unfinished.keySet().iterator().next();
                        int unfinishedTime = unfinished.get(task);

                        if (unfinishedTime <= remainTime) { // 다 수행 가능
                            array.add(task);
                            remainTime -= unfinishedTime;
                        } else { // 일부만 수행 가능 → 남은 시간 업데이트 후 다시 저장
                            unfinished.put(task, unfinishedTime - remainTime);
                            stack.push(unfinished);
                            remainTime = 0;
                        }
                    }
                }
            }
        }

        // 스택에 남은 미완료 과제 수행
        while (!stack.isEmpty()) {
            HashMap<String, Integer> unfinished = stack.pop();
            array.add(unfinished.keySet().iterator().next());
        }

        // 리스트를 배열로 변환 후 반환
        return array.toArray(new String[0]);
    }        
}