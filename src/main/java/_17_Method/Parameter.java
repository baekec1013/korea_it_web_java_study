package _17_Method;

public class Parameter {
    public static void power(int number) {
        // 거듭제곱을 하는 메소드
        // 매개변수를 전달 받아서 해당 매개변수를 거듭제곱
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은" + result + "입니다.");
    }
    public static void getAvg(int num1, int num2, int num3) {
        int result = (num1 + num2 + num3) / 3;
        System.out.println(result);
    }
    public static void isEven(int num) {
      String  result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);
    }

    public static void main(String[] args) {
        // Parameter
        // 매개변수, 전달값
        int num = 4;
        power(num);

        powerByExp(2, 4);

        getAvg(80, 90, 100);

        isEven(2);
    }
    // 세개의 정수를 전달하여 평균을 출력하는 메소드
    // getAvg(80, 90, 100);
}
