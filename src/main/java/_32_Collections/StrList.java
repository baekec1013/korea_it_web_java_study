package _32_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection
//여러 객체를 모아놓는 것
//list => 순서가 있는 데이터의 집합, 중복된 요소를 허락함
//ArrayList, LinkedList
public class StrList {
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>(); //방법1
        //element 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A"); //중복허용

        //방법2
        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A"));

        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

        String[] strArray = new String[2];
        strArray[0] = "백은찬";
        strArray[1] = "이동윤";

        //출력
    }
}
