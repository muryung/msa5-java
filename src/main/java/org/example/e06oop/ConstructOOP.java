package org.example.e06oop;

public class ConstructOOP {
    private String name;
    private int age;
    private final char gender;

    // 생성자 (constructor) 메소드
    // 클래스를 인스턴스화 할 때, 최초 1회만 실행되는 메소드
    // 주로 객체의 초기화 또는 인스턴스 생성 시, 실행되어야 할 작업을 위해 사용

    // 기본 생성자: 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자
    public ConstructOOP() {
        this("무명");
    }

    // 커스텀 생성자
    public ConstructOOP(String name) {
        // this(); // 기본 생성자 호출이 생략되어 있다.
        // this 참조 변수: 클래스 자기 자신을 가르킴
        this(name, 20);
    }

    public ConstructOOP(String name, int age) {
        this(name, age, 'M');
    }

    public ConstructOOP(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
