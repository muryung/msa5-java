package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        Box<int[]> boxIntArr = new Box<>(new int[5]);
        Box<String[]> boxStringArr = new Box<>(new String[3]);
        Box<Integer> boxInt = new Box<>(1);

        // BoxRestrict<Tv> tvRestrict = new BoxRestrict<>();
        BoxRestrict<Mobile> mobileRestrict = new BoxRestrict<>();
        // BoxRestrict<Novel> novelRestrict = new BoxRestrict<>();

    }
}
