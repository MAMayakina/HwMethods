public class Main {

    //Задание 1. Метод, проверяющий деление и возвращающий остаток
    public static int checkDivision(int number) {
        int checkDivision = 0;
        if (number % 4 == 0 && number % 100 != 0) {
            checkDivision = 1;
        } else if (number % 4 == 0 && number % 100 == 0 && number % 400 == 0) {
            checkDivision = 1;
        }
        return checkDivision;
    }

    //Задание 2. Метод, анализирующий год выпука устройства и ОС
    public static void Version(int year, int OS) {
        switch (OS) {
            case 0:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.print("Установите ");
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
    public static int day(int number) {
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
        int total = checkDivision(year);
        if (total == 0) {
            System.out.println(year + " - не високосный год");
        } else {
            System.out.println(year + " - високосный год");
        }

        // Задание 2
        System.out.println("Задание 2:");
        byte clientOS = 0;
        int clientDeviceYear = 2022;
        Version(clientDeviceYear, clientOS);

        // Задание 3
        System.out.println("Задание 3:");
        int deliveryDistance = 95;
        int result = day(deliveryDistance);
        if (result > 0) {
            System.out.println("Потребуется дней: " + result);
        } else if (result == 0) {
            System.out.println("Слишком большое расстояние для доставки.");
        } else {
            System.out.println("Введено некорректное значение расстояния.");
        }
    }
}