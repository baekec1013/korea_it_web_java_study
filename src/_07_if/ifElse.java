package _07_if;

public class ifElse {
    public static void main(String[] args) {
        // else는 조건이 참이 아니면 즉 조건이 거짓이면 실행되는 코드이다.

        // 키가 120 이상이어야 탑승 가능
        int heigth = 120;
        if (heigth >= 120) {
            System.out.println("탑승 가능");
        }else {
            System.out.println("탑승 불가능");
        }
    }
}
