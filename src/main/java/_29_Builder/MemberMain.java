package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member.Builder()
                .name("백은찬")
                .age(27)
                .email("baekec1013@gmail.com")
                .build();
    }
    //빌더 방식을 이용했을 때의 이점
    //1. 가독성이 높아짐.
    //2. 매개변수의 순서를 지키지 않아도 된다ㅏ.
    //3.
}

