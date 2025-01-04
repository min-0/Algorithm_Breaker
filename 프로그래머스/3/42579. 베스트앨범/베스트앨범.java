import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, ArrayList<int[]>> songs = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            
            if(!songs.containsKey(genres[i])) {
                songs.put(genres[i], new ArrayList<>());
            }
            songs.get(genres[i]).add(new int[]{plays[i], i});
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((g1, g2) -> map.get(g2).compareTo(map.get(g1)));
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(String genre : list) {
            ArrayList<int[]> songList = songs.get(genre);
            
            songList.sort((a, b) -> {
                if(a[0] != b[0]) {
                    return b[0] - a[0];
                }
                return a[1] - b[1];
            });
            
            answer.add(songList.get(0)[1]);
            if(songList.size() > 1) {
                answer.add(songList.get(1)[1]);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}