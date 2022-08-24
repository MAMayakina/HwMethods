public class Main {

    //Задание 1. Метод, проверяющий високосный год или нет
    private static void printYearInfo(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //Задание 2. Метод, анализирующий год выпука устройства и ОС
    private static void selectVersion(int year, int OS) {
        switch (OS) {
            case 0:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Входные данные некорректны.");
                break;
        }
    }

    //Задание 3. Метод, анализирующий время доставки
    private static int calculationDay(int number) {
        int day = 0;
        //расчет количества дней
        if (number <= 0) {
            day = -1;
        } else if (number < 20) {
            day = 1;
        } else if (number < 60) {
            day = 2;
        } else if (number < 100) {
            day = 3;
        }
        return day;
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1:");
        int year = 2020;
        printYearInfo(year);


        // Задание 2
        System.out.println("Задание 2:");
        byte clientOS = 0;
        int clientDeviceYear = 2022;
        selectVersion(clientDeviceYear, clientOS);

        // Задание 3
        System.out.println("Задание 3:");
        int deliveryDistance = 95;
        int result = calculationDay(deliveryDistance);
        if (result > 0) {
            System.out.println("Потребуется дней: " + result);
        } else if (result == 0) {
            System.out.println("Слишком большое расстояние для доставки.");
        } else {
            System.out.println("Введено некорректное значение расстояния.");
        }
    }
}