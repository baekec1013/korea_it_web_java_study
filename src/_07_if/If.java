package _07_if;

public class If {
    public static void main(String[] args) {

        // 조건문 if
        // 키가 120 이상이어야 탑승 가능
        int height = 130;
        // if (조건) {
        // 조건이 참일때 실행되는 코드
        // }
         if (height >= 120) {
             System.out.println("탑승 가능");
             System.out.println("탑승 함");
         }
         // 키가 120 이상이고 어른이 아니면 탑승 가능
        boolean isAdult = false;
         if (height >= 120 && !isAdult) {
             System.out.println("탑승 가능");
         }

         // 키가 120 이상이거나 어른이면 탑승 가능

        if (height >= 120 || isAdult) {
            System.out.println("탑승 가능");
        }

    }
}
