public class Main {

    public static void main(String[] args) {
        task1();
        task2();
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
        task1_1((byte) 1);
        task1_1((byte) 0);
    }

    public static void task2_1 () {
    }
    public static void task2 () {
        System.out.println("\nЗадача №2");
        // Пишем код для задачи 2
        task2_1();
        }
}