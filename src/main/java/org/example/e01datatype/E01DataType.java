package org.example.e01datatype;

public class E01DataType {
    public void execute() {
        boolean bool = true;
        // bool = 1; 선언할 때의 테이터 타입과 다를 경우, 타입 에러가 발생한다.

        // 변수 선언
        int age;
        age = 1;
        char ch = 'a';
        String str = "a";

        // 상수
        final String USER_NAME = "AAA";

        // Underscore 표기법
        int num = 1_111_111_111;

        // 두 변수의 값을 스와핑
        int swap1 = 1;
        int swap2 = 2;
        int temp;

        temp = swap1;
        swap1 = swap2;
        swap2 = temp;

        // 데이터 타입
        boolean bool2 = true;

        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long lng = 2147483647L; // long 타입은 반드시 가장 뒤에 `L`을 붙여줄 것

        double db = 3.141592;
        float ft = 3.141592F; // float 타입은 반드시 가장 뒤에 `F`를 붙여줄 것

        char ch1 = 'g';
    }
}






