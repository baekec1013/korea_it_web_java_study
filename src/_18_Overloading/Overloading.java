package _18_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }
    public static int getPower(double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }
    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower(int number, int exopenent) {
        int result = 1;
        for (int i = 0; i < exopenent; i++) {
            result *= number;
        }
        return result;
    }

    public static void printInfo(String name) {
        System.out.println("이름은 " + name);
    }
    public static void printInfo(String name, int age) {
        System.out.println("이름은 " + name + " 나이는 " + age);
    }
    public static void printInfo(String name, int age, String email) {
        System.out.println("이름은 " + name + " 나이는 " + age + " 이메일은 " + email);
    }
//    public static void add(int num1, int num2) {
//        result = num1 + num2;
//    }
//    public static void add(double num3, double num4) {
//        result = (int) num3 + (int) num4;
//    }
//    public static void add(String num5, String num6) {
//        result = Integer.parseInt(num5) + Integer.parseInt(num6);
//    }




    public static void main(String[] args) {
        //메소드 오버로딩[
        //같은 이름의 메소드를 여러개 선언
        //매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2,4));

        printInfo("백은찬");
        printInfo("백은찬",18);
        printInfo("백은찬",18,"baekec1013@gmail.com");


        // 문제
        // 메소드 이름 printInfo()
        // 문자열 이름만 전달 => 이름을 출력
        // 문자열 이름, 정수 나이 => 이름 나이 출력
        // 문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력

        //메소드 이름 add()
        //int와 int 덧셈
        //double과 double의 덧셈
        //String과 String의 덧셈
    }
}
