package _22_Inheritance;

public class Tiger extends Animal{
    // Animal에게 상속받아 Animal이 가지고 있는 속성과 메소드를 그대로 받음
    // Animal은 부모클래스(슈퍼클래스), Tiger는 자식클래스(서브클래스)
    // 이때 부모클래스에는 없는 속성을 따로 추가할 수 있다.
    private boolean isStriped;

    public Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체 생성");
    }

}
