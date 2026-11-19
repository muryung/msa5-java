package org.example.e06oop.inheritance;

public class FlyingFish extends Animal {
    public FlyingFish(String name, String residence) {
        super(name, residence);
    }

    public String flying() {
        return String.format("%s이/가 날아갑니다.", super.name);
    }

    // 오버라이딩(Overriding): 부모에게서 상속받은 메소드를 자식이 재정의 하여 사용
    @Override
    public String living() {
        return "수정했다";
    }
}
