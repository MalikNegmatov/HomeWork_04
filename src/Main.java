public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
             }

    public static void task1_1 (byte osVersion) {

          if (osVersion == 1) {
            System.out.println("Вы используете Android." +
            " Установите версию приложения для Android по ссылке Link1.");
          }
          else {
              System.out.println("Вы используете iOS." +
                      " Установите версию приложения для iOS по ссылке Link2.");
          }
    }
    public static void task1 () {
        System.out.println("Задача №1");
        // Пишем код для задачи 1
        byte clientOS = 0;
        task1_1(clientOS);

        clientOS = 1;
        task1_1(clientOS);
    }

    public static void task2_1(int osVersion, int phoneYearRelease) {


        if (phoneYearRelease > 2014 && osVersion == 1) {
                System.out.println("Вы используете Android." +
                    " Установите версию приложения для Android по ссылке Link1.");
        }   else if (phoneYearRelease > 2014 && osVersion == 0) {
                System.out.println("Вы используете iOS." +
                    " Установите версию приложения для iOS по ссылке Link2.");
        }   else if (phoneYearRelease < 2015 && osVersion == 1) {
                System.out.println("Вы используете Android." +
                    " Установите облегченную версию приложения для Android по ссылке Link3.");
        }   else {
            System.out.println("Вы используете iOS." +
                    " Установите облегченную версию приложения для iOS по ссылке Link4.");
        }
    }

    public static void task2 () {
        System.out.println("\nЗадача №2");
        // Пишем код для задачи 2
        int clientOS = 0;
        int clientDeviceYear = 2015;
        task2_1(clientOS, clientDeviceYear);

        clientDeviceYear = 2012;
        task2_1(clientOS, clientDeviceYear);

        clientOS = 1;
        clientDeviceYear = 2021;
        task2_1(clientOS, clientDeviceYear);

        clientDeviceYear = 2014;
        task2_1(clientOS, clientDeviceYear);
        }
    public static void task3_1 (int year) {

        if (year % 4 != 0) {
            System.out.println(year + " год не является високосным.");
        }   else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным.");
        }   else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        }   else {
            System.out.println(year + " год является високосным.");
        }
    }
    public static void task3 () {
        System.out.println("\nЗадача №3");
        // Пишем код для задачи 3
        int year = 2000;
        task3_1(year);
        year = 1900;
        task3_1(year);
        year = 2023;
        task3_1(year);
        year = 2024;
        task3_1(year);
    }
    public static int task4_1(int distance) {

        if (distance < 20) {return 1;
        }   else if (distance <60) {
            return 2;
        }   else {
            return 3;
        }
    }
    public static void task4 () {
        System.out.println("\nЗадача №4");
        // Пишем код для задачи 3

        int deliveryDistance = 95;
        int deliveryDays = task4_1(deliveryDistance);
        System.out.println("Потребуется дней:" + deliveryDays);

        deliveryDistance = 20;
        deliveryDays = task4_1(deliveryDistance);
        System.out.println("Потребуется дней:" + deliveryDays);

        deliveryDistance = 8;
        deliveryDays = task4_1(deliveryDistance);
        System.out.println("Потребуется дней:" + deliveryDays);
    }


}