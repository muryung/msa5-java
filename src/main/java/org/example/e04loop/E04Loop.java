package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        // for (초기문; 조건문; 증감문)
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        for (int i = 0; i < 2; ++i) {
            System.out.println(i);

            for (int j = 0; j < 5; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **
        // 2 X 1 = 2
        // 2 X 2 = 4
        // ...
        // ** 3단 **
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 9 X 8 = 72
        // 9 X 9 = 81
        for (int i = 2; i <= 9; ++i) {
            System.out.printf("** %d단 ** \n", i);
            for (int j = 1; j <= 9; ++j) {
                System.out.printf("%d X %d = %d \n", i, j, i * j);
            }
        }
    }
}
