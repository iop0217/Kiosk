package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    Scanner scanner = new Scanner(System.in);

    private List<MenuItem> menuItems = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    private Menu menu = new Menu();

    // 장바구니 확인 포기

    // 메뉴 저장
    public void storage(MenuItem menuItem, int quantity) {
        int find = menuItems.indexOf(menuItem);
        if (find != -1) {
            quantities.set(find, quantities.get(find) + quantity);
        } else {
            menuItems.add(menuItem);
            quantities.add(quantity);
        }
    }

    // 메뉴 추가
    public void addM(MenuItem menuItem, int quantity) {
        while (true) {
            System.out.println("\n메뉴를 장바구니에 추가하시겠습니까?");
            System.out.print("'1'을 입력하면 추가, '2'을 입력하면 취소됩니다: ");
            String comfir = scanner.nextLine();

            if (comfir.equals("1")) {
                if (quantity < 1) {
                    System.out.println("최소 1개 이상 추가해야 합니다.");
                    break;
                } else {
                    System.out.println(quantity + "개가 장바구니에 추가되었습니다.");
                    storage(menuItem, quantity);
                    break;
                }
            } else if (comfir.equals("2")){
                System.out.println("메뉴 선택을 취소하였습니다.");
                menu.choiceCategory();
            }
        }
    }

    // 수량 변경
    public void changeQ(MenuItem menuItem, int quantity) {
        int find = menuItems.indexOf(menuItem);
        if (find != -1) {
            if (quantity <= 0) {
                System.out.println("수량은 1개 이상이어야 합니다.");
            } else {
                quantities.set(find, quantity);
            }
        }
    }

    // 메뉴 삭제
    public void removeM(MenuItem menuItem) {
        int find = menuItems.indexOf(menuItem);
        if (find == -1) {
            System.out.println("삭제할 메뉴가 장바구니에 없습니다.");
        } else if (find != -1) {
            menuItems.remove(find);
            quantities.remove(find);
            System.out.println(menuItem.getName() + "가 장바구니에서 삭제되었습니다.");
        }
    }

    // 장바구니 초기화
    public void clear() {
        menuItems.clear();
        quantities.clear();
        System.out.println("감사합니다.");
    }
}
