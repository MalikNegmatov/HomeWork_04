public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
    public static void task3_1 () {
    }
    public static void task3 () {
        System.out.println("\nЗадача №3");
        // Пишем код для задачи 2
        task3_1();
    }
}