public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");

        System.out.println("Задача 1");
        int clientOS = 0;
        String os1 = "IOS", os2 = "Android";
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для " + os2 + " по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для " + os1 + " по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        int clientOs = 1;
        String os3 = "IOS", os4 = "Android";
        String ver = clientDeviceYear < 2015 ? " облегченную " : " ";
        if (clientOs == 0) {
            System.out.println("Установите " + ver + " версию приложения для " + os3 + " по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите" + ver + "версию приложения для " + os4 + " по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2021;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет.");
        }

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}