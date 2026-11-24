package org.example.e12stream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);

        List<Integer> copyList = new ArrayList<>();
        list.forEach((i) -> {
            copyList.add(i + 3);
        });

        List<Integer> result1 = list.stream()
                .map((i) -> i + 3)
                .toList();

        // `list`에서 짝수의 개수를 구해주세요.
        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                cnt++;
        }

        long result2 = list.stream()
                .filter((i) -> i % 2 == 0)
                .count();

        System.out.println(result2);
    }
}
