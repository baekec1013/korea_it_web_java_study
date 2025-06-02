package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(27)
                .email("baekec1013@gmail.com")
                .name("백은찬")
                .build();
    }
}
