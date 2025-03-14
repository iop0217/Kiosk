package kiosk;

import two.one.Car;

import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);

    private Menu menu = new Menu();
    private MenuItem menuItem = new MenuItem("", "", "", "");
    private Choose choose = new Choose();
    private Cart cart = new Cart();
    private Payment payment = new Payment();
    private Receipt receipt = new Receipt();

    public void startMenu() {
        menuItem.getCategory();

        while (true) {
            // 카테고리, 메뉴 선택
            menu.choiceCategory();
            String select = menu.menuChoose();

            // 메뉴별 세부사항 선택
            choose.choice(select);

            // 장바구니 담기
            System.out.print("주문할 수량을 입력해주세요: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            cart.addM(menuItem, quantity);

            // 결제 or 주문 추가
            System.out.print("\n결제하시려면 '1', 더 주문하려면 '2'를 입력해주세요: ");
            int check = scanner.nextInt();

            switch (check) {
                case 1:
                    payment.packSto();
                    payment.selectPay();
                    receipt.getOrder();
                    break;
                case 2:
                    continue;
                default:
                    System.out.println("번호를 입력해주세요.");
            }
            break;
        }
    }
}
