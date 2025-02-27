import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void getYear(int meansYear) {
        if ((meansYear % 400) == 0 || (meansYear % 4 == 0 && meansYear % 100 != 0)) {
            System.out.println(meansYear + " год является високосным");
        } else {
            System.out.println(meansYear + " год не является високосным");
        }
    }

    public static void getOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1:");
        int year = 2024;
        getYear(year);

        //Задача №2
        System.out.println("Задача №2:");
        int deviceYear = 2025;
        int OS = 0;
        getOS(OS, deviceYear);
    }
}