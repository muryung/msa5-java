package org.example.e06oop.interfaceedu;

class FlyingFish extends Fish implements Swim, Flight {
    FlyingFish() {
        super("날치", "바다");
    }

    @Override
    String residence() {
        return String.format("%s이/가 %s에 삽니다.", super.name, super.residence);
    }

    @Override
    public String swimming() {
        return String.format("%s이/가 헤엄칩니다.", super.name);
    }

    @Override
    public String flying() {
        return String.format("%s이/가 납니다.", super.name);
    }
}
