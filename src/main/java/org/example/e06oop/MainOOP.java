package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

public class MainOOP {
    public static void main(String[] args) {
        // Whale whale = new Whale();
        // FlyingFish flyingFish = new FlyingFish();

        // System.out.println(Whale.age);
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.fnProtected();

        // 오버로딩 (Overloading)
        // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println(OverloadingOOP.add(3, 10));

        ConstructOOP constructOOP = new ConstructOOP();
        ///////////////////////////////////
        // 상속
        ///////////////////////////////////
        FlyingFish flyingFish = new FlyingFish("날치", "바다");
        System.out.println(flyingFish.living());

        Whale whale = new Whale("고래", "바다");
        System.out.println(whale.swimming());
    }
}