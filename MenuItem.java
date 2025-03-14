package kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private static List<MenuItem> allMenu = new ArrayList<>();

    private String name;
    private String price;
    private String description;
    private String category;

    public MenuItem(String name, String price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;

    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + description;
    }

    // 이름, 가격, 설명
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // 메뉴
    public static List<MenuItem> getCategory() {
        if (allMenu.isEmpty()) {
            allMenu.add(new MenuItem("에스프레소", "3,000원", "진한 맛의 에스프레소", "커피"));
            allMenu.add(new MenuItem("아메리카노", "3,500원", "진한 에스프레소에 물을 추가한 커피", "커피"));
            allMenu.add(new MenuItem("카페라떼", "3,800원", "에스프레소와 우유의 부드러운 조합", "커피"));
            allMenu.add(new MenuItem("바닐라라떼", "4,200원", "부드러운 바닐라 향이 더해진 라떼", "커피"));
            allMenu.add(new MenuItem("카푸치노", "4,000원", "부드러운 우유 거품과 진한 에스프레소", "커피"));
            allMenu.add(new MenuItem("카페모카", "4,500원", "에스프레소와 초콜릿, 우유의 조화", "커피"));
            allMenu.add(new MenuItem("카라멜마끼아또", "4,500원", "카라멜 소스와 에스프레소, 우유가 어우러진 음료", "커피"
            ));

            allMenu.add(new MenuItem("딸기라떼", "4,800원", "달콤한 딸기와 우유의 조화", "라떼"));
            allMenu.add(new MenuItem("초코라떼", "4,500원", "달콤한 초콜릿과 우유의 부드러운 조합", "라떼"));
            allMenu.add(new MenuItem("녹차라떼", "4,000원", "부드러운 우유와 녹차의 조화", "라떼"));
            allMenu.add(new MenuItem("고구마라떼", "4,800원", "달콤하고 부드러운 고구마 맛", "라떼"));
            allMenu.add(new MenuItem("밀크티", "4,500원", "진한 홍차와 우유의 조화", "라떼"));

            allMenu.add(new MenuItem("요거트스무디", "5,000원", "상큼하고 시원한 요거트 맛", "프라페&스무디"));
            allMenu.add(new MenuItem("딸기스무디", "5,000원", "상큼하고 달콤한 딸기 스무디", "프라페&스무디"));
            allMenu.add(new MenuItem("망고스무디", "5,500원", "달콤하고 시원한 망고 맛", "프라페&스무디"));
            allMenu.add(new MenuItem("복숭아스무디", "5,500원", "상큼하고 달콤한 복숭아 맛", "프라페&스무디"));
            allMenu.add(new MenuItem("블루베리스무디", "5,500원", "상큼하고 달콤한 블루베리 맛", "프라페&스무디"));
            allMenu.add(new MenuItem("초코프라페", "5,500원", "진한 초콜릿과 시원한 얼음의 조화", "프라페&스무디"));
            allMenu.add(new MenuItem("녹차프라페", "5,500원", "고소하고 시원한 녹차 맛", "프라페&스무디"));
            allMenu.add(new MenuItem("자바칩프라페", "5,800원", "진한 커피와 초콜릿 칩의 조화", "프라페&스무디"));

            allMenu.add(new MenuItem("밀크쉐이크", "5,000원", "부드럽고 고소한 밀크쉐이크", "밀크쉐이크"));
            allMenu.add(new MenuItem("딸기쉐이크", "5,500원", "부드럽고 달콤한 딸기 쉐이크", "밀크쉐이크"));
            allMenu.add(new MenuItem("초코쉐이크", "5,500원", "진한 초콜릿 맛의 쉐이크", "밀크쉐이크"));
            allMenu.add(new MenuItem("커피쉐이크", "5,500원", "진한 커피 맛의 쉐이크", "밀크쉐이크"));
            allMenu.add(new MenuItem("쿠키쉐이크", "5,800원", "쿠키와 함께한 부드러운 쉐이크", "밀크쉐이크"));

            allMenu.add(new MenuItem("아이스티", "3,500원", "상큼한 차의 맛을 시원하게", "에이드&주스"));
            allMenu.add(new MenuItem("미숫가루", "4,000원", "고소한 미숫가루와 우유가 조화를 이루는 음료", "에이드&주스"));
            allMenu.add(new MenuItem("레몬에이드", "4,500원", "상큼한 레몬이 가득한 에이드", "에이드&주스"));
            allMenu.add(new MenuItem("자몽에이드", "4,500원", "상큼한 자몽이 들어간 에이드", "에이드&주스"));
            allMenu.add(new MenuItem("유자에이드", "4,500원", "달콤하면서 시원한 유자 맛", "에이드&주스"));
            allMenu.add(new MenuItem("청포도에이드", "4,500원", "청포도의 상큼함이 가득한 에이드", "에이드&주스"));
            allMenu.add(new MenuItem("딸기바나나주스", "4,800원", "달콤한 딸기와 바나나가 어우러진 주스", "에이드&주스"));
            allMenu.add(new MenuItem("체리콕", "5,000원", "체리와 콜라의 맛있는 조화", "에이드&주스"));

            allMenu.add(new MenuItem("아이스티", "3,500원", "상큼하고 시원한 차의 맛", "티"));
            allMenu.add(new MenuItem("녹차", "3,800원", "고소하고 깊은 맛의 녹차", "티"));
            allMenu.add(new MenuItem("유자차", "4,000원", "달콤하고 상큼한 유자차", "티"));
            allMenu.add(new MenuItem("얼그레이", "4,000원", "고급스러운 향이 나는 얼그레이", "티"));
            allMenu.add(new MenuItem("캐모마일", "4,000원", "은은하고 상쾌한 캐모마일", "티"));
            allMenu.add(new MenuItem("페퍼민트", "4,000원", "상쾌한 페퍼민트 맛", "티"));

            allMenu.add(new MenuItem("쿠키", "2,500원", "고소하고 달콤한 쿠키", "디저트"));
            allMenu.add(new MenuItem("마카롱", "3,000원", "달콤하고 바삭한 마카롱", "디저트"));
            allMenu.add(new MenuItem("소금빵", "3,000원", "짭짤한 소금과 고소한 빵", "디저트"));
            allMenu.add(new MenuItem("크로플", "4,000원", "크로와상과 와플이 결합된 디저트", "디저트"));
            allMenu.add(new MenuItem("케이크", "4,500원", "부드럽고 달콤한 케이크", "디저트"));
        }
        return allMenu;
    }

    // 선택한 카테고리
    public static void getCate(String selCate) {
        System.out.println("\n[ " + selCate + " 메뉴 ]");
        for (MenuItem selNum : allMenu) {
            if (selNum.category.equals(selCate)) {
                System.out.println(selNum);
            }
        }
    }

    // 메뉴명 확인
    public boolean isValidMenu(String menuName) {
        allMenu.addAll(allMenu);

        for (MenuItem menu : allMenu) {
            if (menu.getName().equalsIgnoreCase(menuName)) {
                return true;
            }
        }
        return false;
    }
}