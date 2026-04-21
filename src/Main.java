import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void returnYearString (int year){
        //int year = 2024;
        if (year <=1584){
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void recomendVersionOC (int clientDeviceYear, int clientOS){
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 0)   {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 1)   {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public static void returnDeliveryDays (int deliveryDistance ){
        //int deliveryDistance = 100;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Дистанция в пределах " + deliveryDistance + " км занимает " + deliveryDays + " сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
            System.out.println("Дистанция в пределах " + deliveryDistance + " км занимает " + deliveryDays + " суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Дистанция в пределах " + deliveryDistance + " км занимает " + deliveryDays + " суток");
        } else if (deliveryDistance > 100) {
            deliveryDays++;
            System.out.println("Дистанция свыше 100 км - доставка не производится, вам необходимо ее организовать самому!");
        }
    }


    public static void main(String[] args) {

    System.out.println("Задача 1");
        int year = 2029;
        returnYearString(year);

    System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();// для проверки на текущий год
        int currentOldYear = 2014;//для проверки старых версий
        int currentVersion = 1;
        recomendVersionOC(currentYear, currentVersion);
        recomendVersionOC(currentOldYear, currentVersion);

        System.out.println("Задача 3");
        int deliveryDistance = 5;
        returnDeliveryDays(deliveryDistance);
    }
}