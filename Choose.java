package kiosk;

import java.util.Scanner;

public class Choose {
    Scanner scanner = new Scanner(System.in);

    private String select;
    private String hotice;
    private int shot;
    private int sirup;
    private String cream;
    private String size;
    private String ice;
    private String cookie;
    private String macaron;
    private String sult;
    private String croiffle;
    private String cake;

    public String getChoose() {
        this.select = select;
        return select;
    }

    // 메뉴별 세부 설정
    public void choice(String select) {
        switch (select) {
            case "에스프레소":
                setSirup(scanner);
                setCream(scanner);
                setIce(scanner);
                break;
            case "아메리카노":
                setHotice(scanner);
                setShot(scanner);
                setSirup(scanner);
                setSize(scanner);
                setIce(scanner);
                break;
            case "카페라떼":
            case "바닐라라떼":
            case "카푸치노":
            case "카페모카":
            case "카라멜마끼아또":
                setHotice(scanner);
                setShot(scanner);
                setSirup(scanner);
                setCream(scanner);
                setSize(scanner);
                setIce(scanner);
                break;
            case "딸기라떼":
            case "초코라떼":
            case "녹차라떼":
            case "고구마라떼":
            case "밀크티":
                setHotice(scanner);
                setCream(scanner);
                setIce(scanner);
                break;
            case "요거트스무디":
            case "딸기스무디":
            case "망고스무디":
            case "복숭아스무디":
            case "블루베리스무디":
            case "초코프라페":
            case "녹차프라페":
            case "자바칩프라페":
            case "밀크쉐이크":
            case "딸기쉐이크":
            case "초코쉐이크":
            case "커피쉐이크":
            case "쿠키쉐이크":
                setCream(scanner);
                setSize(scanner);
                break;
            case "아이스티":
            case "미숫가루":
            case "레몬에이드":
            case "자몽에이드":
            case "유자에이드":
            case "청포도에이드":
            case "딸기바나나주스":
            case "체리콕":
                setSize(scanner);
                break;
            case "녹차":
            case "유자차":
            case "얼그레이":
            case "캐모마일":
            case "페퍼민트":
                setHotice(scanner);
                setSirup(scanner);
                setSize(scanner);
                break;
            case "쿠키":
                setCookie(scanner);
                break;
            case "마카롱":
                setMacaron(scanner);
                break;
            case "소금빵":
                setSult(scanner);
                break;
            case "크로플":
                setCroiffle(scanner);
                break;
            case "케이크":
                setCake(scanner);
                break;
        }
    }

    private void setHotice(Scanner scanner) {
        System.out.print("'1. Hot' 또는 '2. Ice' 번호를 입력해주세요: ");
        hotice = scanner.nextLine().trim();
        while (!hotice.equals("1") && !hotice.equals("2")) {
            System.out.print("'1. Hot' 또는 '2. Ice' 번호를 입력해주세요: ");
            hotice = scanner.nextLine().trim();
        }
    }

    private void setShot(Scanner scanner) {
        while (true) {
            try {
                System.out.print("샷 추가 횟수를 입력해주세요(최소 0, 최대 1): ");
                shot = scanner.nextInt();
                scanner.nextLine();

                if (shot < 0) {
                    System.out.println("해당 메뉴의 샷을 뺄 수 없습니다.");
                } else if (1 < shot) {
                    System.out.println("한 메뉴에 최대 2샷까지 가능합니다.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("잘못된 횟수입니다.");
            }
        }
    }

    private void setSirup(Scanner scanner) {
        while (true) {
            try {
                System.out.print("시럽 추가 횟수를 입력해주세요(최소 0, 최대 2): ");
                sirup = scanner.nextInt();
                scanner.nextLine();

                if (sirup < 0) {
                    System.out.println("해당 메뉴의 레시피에는 기본으로 시럽이 포함되어 있지 않습니다.");
                } else if (2 < sirup) {
                    System.out.println("한 메뉴에 최대 2번의 시럽까지 가능합니다.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못된 횟수입니다.");
            }
        }
    }

    private void setCream(Scanner scanner) {
        System.out.print("휘핑크림 번호를 입력해주세요(1. 없음, 2. 적게, 3. 보통, 4. 많이): ");
        cream = scanner.nextLine().trim();
        while (!cream.equals("1") && !cream.equals("2") && !cream.equals("3") && !cream.equals("4")) {
            System.out.print("휘핑크림 번호를 입력해주세요(1. 없음, 2. 적게, 3. 보통, 4. 많이): ");
            cream = scanner.nextLine().trim();
        }
    }

    private void setSize(Scanner scanner) {
        System.out.print("음료의 사이즈 번호를 입력해주세요(1. 스몰, 2. 미디엄, 3. 라지): ");
        size = scanner.nextLine().trim();
        while (!size.equals("1") && !size.equals("2") && !size.equals("3")) {
            System.out.print("음료의 사이즈 번호를 입력해주세요(1. 스몰, 2. 미디엄, 3. 라지): ");
            size = scanner.nextLine().trim();
        }
    }

    private void setIce(Scanner scanner) {
        System.out.print("얼음량 번호를 입력해주세요(1. 없음, 2. 적게, 3. 보통, 4. 많이): ");
        ice = scanner.nextLine().trim();
        while (!ice.equals("1") && !ice.equals("2") && !ice.equals("3") && !ice.equals("4")) {
            System.out.print("얼음량 번호를 입력해주세요(1. 없음, 2. 적게, 3. 보통, 4. 많이): ");
            ice = scanner.nextLine().trim();
        }
    }

    private void setCookie(Scanner scanner) {
        System.out.print("쿠키의 종류 번호를 입력해주세요(1. 초코칩, 2. 오트밀, 3. 버터, 4. 피넛버터): ");
        cookie = scanner.nextLine().trim();
        switch (cookie) {
            case "1":
                cookie = "초코칩 쿠키";
                break;
            case "2":
                cookie = "오트밀 쿠키";
                break;
            case "3":
                cookie = "버터 쿠키";
                break;
            case "4":
                cookie = "피넛버터 쿠키";
                break;
            default:
                while (!cookie.equals("1") && !cookie.equals("2") && !cookie.equals("3") && !cookie.equals("4")) {
                    System.out.print("쿠키의 종류 번호를 입력해주세요(1. 초코칩, 2. 오트밀, 3. 버터, 4. 피넛버터): ");
                    cookie = scanner.nextLine().trim();
                }
        }
    }

    private void setMacaron(Scanner scanner) {
        System.out.print("마카롱의 종류 번호를 입력해주세요(1. 바닐라, 2. 레몬, 3. 딸기, 4. 초콜릿, 5. 피스타치오): ");
        macaron = scanner.nextLine().trim();
        switch (macaron) {
            case "1":
                macaron = "바닐라 마카롱";
                break;
            case "2":
                macaron = "레몬 마카롱";
                break;
            case "3":
                macaron = "딸기 마카롱";
                break;
            case "4":
                macaron = "초콜릿 마카롱";
                break;
            case "5":
                macaron = "피스타치오 마카롱";
                break;
            default:
                while (!macaron.equals("1") && !macaron.equals("2") && !macaron.equals("3") && !macaron.equals("4") && !macaron.equals("5")) {
                    System.out.print("마카롱의 종류 번호를 입력해주세요(1. 바닐라, 2. 레몬, 3. 딸기, 4. 초콜릿, 5. 피스타치오): ");
                    macaron = scanner.nextLine().trim();
                }
        }
    }

    private void setSult(Scanner scanner) {
        System.out.print("소금빵의 종류 번호를 입력해주세요(1. 기본, 2. 갈릭, 3. 치즈): ");
        sult = scanner.nextLine().trim();
        switch (sult) {
            case "1":
                sult = "기본 소금빵";
                break;
            case "2":
                sult = "갈릭 소금빵";
                break;
            case "3":
                sult = "치즈 소금빵";
                break;
            default:
                while (!sult.equals("1") && !sult.equals("2") && !sult.equals("3")) {
                    System.out.print("소금빵의 종류 번호를 입력해주세요(1. 기본, 2. 갈릭, 3. 치즈): ");
                    sult = scanner.nextLine().trim();
                }
        }
    }

    private void setCroiffle(Scanner scanner) {
        System.out.print("크로플의 종류 번호를 입력해주세요(1. 플레인, 2. 딸기, 3. 초코, 4. 바나나, 5. 시나몬): ");
        croiffle = scanner.nextLine().trim();
        switch (croiffle) {
            case "1":
                croiffle = "플레인 크로플";
                break;
            case "2":
                croiffle = "딸기 크로플";
                break;
            case "3":
                croiffle = "초코 크로플";
                break;
            case "4":
                croiffle = "바나나 크로플";
                break;
            case "5":
                croiffle = "시나몬 크로플";
                break;
            default:
                while (!croiffle.equals("1") && !croiffle.equals("2") && !croiffle.equals("3") && !croiffle.equals("4") && !croiffle.equals("5")) {
                    System.out.print("크로플의 종류 번호를 입력해주세요(1. 플레인, 2. 딸기, 3. 초코, 4. 바나나, 5. 시나몬): ");
                    croiffle = scanner.nextLine().trim();
                }
        }
    }

    private void setCake(Scanner scanner) {
        System.out.print("케이크의 종류 번호를 입력해주세요(1. 초코, 2. 치즈, 3. 레드벨벳, 4. 티라미수, 5. 당근): ");
        cake = scanner.nextLine().trim();
        switch (cake) {
            case "1":
                cake = "초코 케이크";
                break;
            case "2":
                cake = "치즈 케이크";
                break;
            case "3":
                cake = "레드벨벳 케이크";
                break;
            case "4":
                cake = "티라미수 케이크";
                break;
            case "5":
                cake = "당근 케이크";
                break;
            default:
                while (!cake.equals("1") && !cake.equals("2") && !cake.equals("3") && !cake.equals("4") && !cake.equals("5")) {
                    System.out.print("케이크의 종류 번호를 입력해주세요(1. 초코, 2. 치즈, 3. 레드벨벳, 4. 티라미수, 5. 당근): ");
                    cake = scanner.nextLine().trim();
                }
        }
    }
}

