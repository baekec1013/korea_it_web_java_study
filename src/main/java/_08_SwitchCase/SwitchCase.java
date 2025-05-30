package _08_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // 조건문  - Switch Case
        // 1등 => 전액 장학금
        // 2등 => 반액 장학금
        // 3등 => 반액 장학금
        // 그 이하 => 박수

          int ranking = 1;
//        if (ranking == 1) {
//            System.out.println("전액 장학금");
//        }else if (ranking == 2) {
//            System.out.println("반액 장학금");
//        }else if (ranking == 3) {
//            System.out.println("소정의 상품");
//        }else {
//            System.out.println("박수");
//        }
//        System.out.println("수여 끝");

//        switch (ranking) {
//            case 1:
//                System.out.println("전액 장학금");
//                break;
//            case 2:
//                System.out.println("반액 장학금");
//                break;
//            case 3:
//                System.out.println("소정의 상품");
//                break;
//            default:
//                System.out.println("박수");
//                break;
//        }
//        System.out.println("수여 끝");

//        switch (ranking) {
//            case 1:
//                System.out.println("전액 장학금");
//                break;
//            case 2:
//            case 3:
//                System.out.println("반액 장학금");
//                break;
//            default:
//                System.out.println("박수");
//                break;
//        }
//        System.out.println("수여 끝");

        int price = 7000;
        int grade = 1;
        // 1등급이면 10000, 등급이 한단계씩 낮아질수록 -1000

        switch (grade) {
            case 1:
                price += 3000;
                break;
            case 2:
                price += 2000;
                break;
            case 3:
                price += 1000;
                break;
        }
        System.out.println("가격은" + price + "원입니다.");

        // break를 없애고 switch를 사용하여 이 코드를 완성시키기 위해서는 전부다 += 1000을 하여서
        // case가 1일 때에는 1000, 1000, 1000 총 3000원을 더하게 되고
        // case가 2일 때에는 1000, 1000 chd 2000원을 더하게 되고 마지막으로
        // case가 3일 때에는 1000원만 더해지게 됨으로써 코드가 완성될 수 있다.

        // 봄: 3.4.5 => 봄입니다.
        // 여름: 6.7.8 => 여름입니다.
        // 가을: 9.10.11 => 가을입니다.
        // 겨울: 12.1.2 => 겨울입니다.

//        int month = 4;
//
//        switch (month) {
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("봄입니다.");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("여름입니다.");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("가을입니다.");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("겨울입니다.");
//                break;
//        }

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
        }
        // 입력을 직접 하여 내가 입력한 값에 맞게 계절이 나올 수 있게함.

        // 1~7까지 숫자 하나 변수
        // 월화수목금토일

        int num = scanner.nextInt();

        switch (num) {

            case 1:
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7:
                System.out.println("일");
                break;
        }











    }

}
