package org.example.e03if;

public class E03If {
    public static void main(String[] args) {
        // 0~100의 숫자가 아닐 경우, 오동작한다.
        // 해당 현상을 아래처럼 수정하시오.
        // 0~100의 숫자가 아닐 경우, "유효한 점수가 아닙니다." 출력
        // 그 외 패턴은 기존과 동일

        int score = 0;
        String grade = "";

        if (score > 100 || score < 0) {
            System.out.println("유효한 점수가 아닙니다.");
        } else {
            if (score == 100) {
                grade = "A+";
            } else if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.printf("당신의 점수는 %d점 입니다. <%s>", score, grade);
        }

        // Switch 문
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break;
        }
    }
}
