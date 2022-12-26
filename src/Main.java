public class Main {
    public static void main(String[] args) {
        int money = 15_000;
        int account = 0;
        int months = 0;
        while (account <= 2_459_000) {
            months ++;
            account = account + (account/100) + money;
            System.out.println(account + " руб");
        }
        System.out.println("Прошёл месяц " + months + ", сумма накоплений равна " + months + " рублей.");

        int i = 0;
        while (i < 10) {
            i ++;
            System.out.print(i);
        }
        for (; i>=1;i--) {
            System.out.print(i);
        }

        int people = 12_000_000;
        int born = 17;
        int deceit = 8;
        int increasePeople = (born - deceit) * people / 1000;
        for (int k = 1; k <=10 ; k++) {
            people = people + increasePeople;
            System.out.println("Год " + k + ". Численность населения составляет " + people + " человек.");
        }

        double account2 = 15_000;
        int months2 = 1;
        while (account2 <= 12_000_000) {
            account2 = account2 + account2 * 0.07;
            account2 = Math.round(account2 * 100.0) / 100.0;
            System.out.println("Сумма накоплений " + account2 + " руб. Месяц " + months2);
            months2 ++;
        }

        double account3 = 15_000;
        int months3 = 0;
        while (account3 <= 12_000_000) {
            months3 ++;
            account3 = account3 + account3 * 0.07;
            account3 = Math.round(account3 * 100.0) / 100.0;
            if (months3 % 6 == 0) {
                System.out.println("Сумма накоплений " + account3 + " руб. Месяц " + months3);
            }
        }
        System.out.println("Ожидаемая сумма накоплений " + account3 + " руб. Месяц " + months3);

        double account4 = 15_000;  // Cумма на счёте в банке;
        int months4 = 1;
        while (months4 <= 108) {
            account4 = account4 + account4 * 0.07;
            account4 = Math.round(account4 * 100.0) / 100.0;
            if (months4 % 6 == 0) {
                System.out.println("Сумма накоплений " + account4 + " руб. Месяц " + months4);
            }
            months4 ++;
        }

        int friday = 5;
        for (;friday< 31;friday=friday+7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо поготовить отчёт.");
        }

        int year = 79;
        int current = 2022;
        for (; year <= 2132; year = year + 79) {
            if (year >= 1822 && year <= current) {
                System.out.println(year);
            }
            if (year > current && year <= 2132) {
                System.out.println(year);
            }
        }

        for (int l = 1; l <= 10; l++) {
            System.out.println("2 * " + l + " = " + l * 2);
        }
        System.out.println("end");
    }
}