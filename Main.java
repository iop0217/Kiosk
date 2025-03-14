package kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kiosk kiosk = new Kiosk();

        while (true) {
            System.out.println("주문을 시작하시겠습니까?");
            System.out.print("'0'을 입력하면 시작됩니다: ");
            String start = scanner.nextLine();

            if (start.equals("0")) {
                kiosk.startMenu();
                break;
            } else {
                System.out.println("키오스크를 종료합니다.");
                break;
            }
        }
        scanner.close();
    }
}
