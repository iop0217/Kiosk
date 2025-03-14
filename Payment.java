package kiosk;

import java.util.Scanner;

public class Payment {
    Scanner scanner = new Scanner(System.in);

    // 매장 취식, 포장 선택
    public void packSto() {
        while (true) {
            System.out.println("\n주문 방법을 선택하세요.");
            System.out.print("1. 매장, 2. 포장: ");
            String way = scanner.nextLine();

            if (way.equals("1") || way.equals("매장")) {
                System.out.println("매장 취식을 선택하셨습니다.");
                break;
            } else if (way.equals("2") || way.equals("포장")) {
                System.out.println("포장을 선택하셨습니다.");
                break;
            }
            System.out.println("잘못된 입력입니다.");
        }
    }

    // 결제 방식
    public void selectPay() {
        while (true) {
            System.out.println("\n결제 방식을 선택하세요.");
            System.out.println("1. 카드 결제");
            System.out.println("2. 모바일 결제");
            System.out.println("3. 간편 결제");
            System.out.println("4. 포인트 결제");
            System.out.println("5. 기프티콘");
            System.out.print("\n결제 방식 번호: ");
            int pay = scanner.nextInt();

            switch (pay) {
                case 1, 2, 3, 4, 5:
                    paying();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            } break;
        }
    }

    // 결제
    public void paying() {
        System.out.println("결제를 진행해주세요.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("결제가 취소되었습니다.");
        }
        System.out.println("\n결제가 완료되었습니다.");
        System.out.println("번호표를 받아가세요.");
    }
}

