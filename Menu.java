package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    private List<String> category = new ArrayList<>();
    private MenuItem menuItem = new MenuItem("", "", "", "");

    public Menu() {
        category.add("1. 커피");
        category.add("2. 논커피 라떼");
        category.add("3. 프라페&스무디");
        category.add("4. 밀크쉐이크");
        category.add("5. 에이드&주스");
        category.add("6. 티");
        category.add("7. 디저트");
        category.add("8. 종료");
    }

    public void getCategory() {
        System.out.println("\n[ 방구석 카테고리 ]");
        for (int i = 0; i < category.size(); i++) {
            String menu = category.get(i);
            System.out.println(menu);
        }
    }

    public void choiceCategory() {
        getCategory();
        System.out.print("\n카테고리 번호를 입력해주세요: ");

        while (true) {
            String choiceCate = scanner.nextLine();

            switch (choiceCate) {
                case "1":
                    menuItem.getCate("커피");
                    return;
                case "2":
                    menuItem.getCate("라떼");
                    return;
                case "3":
                    menuItem.getCate("프라페&스무디");
                    return;
                case "4":
                    menuItem.getCate("밀크쉐이크");
                    return;
                case "5":
                    menuItem.getCate("에이드&주스");
                    return;
                case "6":
                    menuItem.getCate("티");
                    return;
                case "7":
                    menuItem.getCate("디저트");
                    return;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("카테고리 번호를 입력해주세요.");
            }
        }
    }

    // 존재하는 메뉴인지 확인 후 선택
    public String menuChoose() {
        String choiceMenuName;

        while (true) {
            System.out.print("\n메뉴 이름을 입력해주세요 ('0'을 입력하면 카테고리로 돌아갑니다): ");
            choiceMenuName = scanner.nextLine();

            if (choiceMenuName.equals("0")) {
                choiceCategory();
                if (choiceMenuName.equals("8")) {
                    System.exit(0);
                }
            } else {
                if (menuItem.isValidMenu(choiceMenuName)) {
                    System.out.println(choiceMenuName + "를 선택하셨습니다.\n");
                    break;
                } else {
                    System.out.println("잘못된 메뉴 이름입니다.");
                }
            }
        }
        return choiceMenuName;
    }
}
