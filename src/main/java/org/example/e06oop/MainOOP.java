package org.example.e06oop;

public class MainOOP {
    public static void main(String[] args) {
        Whale whale = new Whale();
        FlyingFish flyingFish = new FlyingFish();

        // System.out.println(Whale.age);
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.fnProtected();

        // 오버로딩 (Overloading)
        // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println(OverloadingOOP.add(3, 10));
    }
}