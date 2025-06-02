package _31_Generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터: ", "백은찬", 18, 10.13);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());
        ResponseData<String> responseData1 = new ResponseData<>("이름: ", "백은찬");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이: ", 18);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율: ", 3.14);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("현재날짜: ",now);
        System.out.println(nowData);

        //Product 패키지
        //ProductController.java , Product.java
        //상품 정보, => 상품명(productName), 상품정보(productInfo)
    }

}
