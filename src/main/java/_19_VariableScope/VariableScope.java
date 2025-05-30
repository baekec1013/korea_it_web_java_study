package _19_VariableScope;

public class VariableScope {

    public static void methodA() {
        String str  = "abc";
    }
    public static void main(String[] args) {
        String name = "이동윤";

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        {
            int age = 27;
        }
        // System.out.println(age);
    }
}
