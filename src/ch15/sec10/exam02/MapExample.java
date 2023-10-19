package ch15.sec10.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            if (e.getValue() > maxScore) {
                maxScore = e.getValue();
                name = e.getKey();
            }
            totalScore += e.getValue();
        }

        System.out.println(" 최고 점수를 받은 아이디 : " + name);
        System.out.println(" 최고 점수 : " + maxScore);
        System.out.println(" 합계 점수 : " + totalScore);

    }
}
