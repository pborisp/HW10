public class Main {

    public static void getYear(int meansYear) {
        if ((meansYear % 400) == 0 || (meansYear % 4 == 0 && meansYear % 100 != 0)) {
            System.out.println(meansYear + " год является високосным");
        } else {
            System.out.println(meansYear + " год не является високосным");
        }
    }

    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1:");
        int year = 2024;
        getYear(year);
    }
}