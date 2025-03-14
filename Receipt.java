package kiosk;

import java.util.Random;

public class Receipt {
    private StringBuilder app = new StringBuilder();

    Random random = new Random();

    public void append(String text){
        app.append(text).append("\n");
    }

    public void getOrder() {
        System.out.println("\n[ 주문 번호 ]");
        System.out.printf("%03d\n", 1 + random.nextInt(999));
    }
}
