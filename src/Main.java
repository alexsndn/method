public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");
        int year = 2021;
        checkPrintYear(year);
        //Задание 2
        System.out.println("задание 2");
        int releaseDate = 2015;
        int clientOs = 1;
        checkUserOS(clientOs, releaseDate);
        //Задание 3
        System.out.println("задание 3");
        int deliveryDistance = 95;
        delieveryCard(deliveryDistance);
    }

    public static void checkPrintYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void checkUserOS(int clientOS, int releaseDate) {
        if(clientOS == 0 && releaseDate>2014){
            System.out.println("Обычная версия для IOS");
        } else if(clientOS == 1 && releaseDate>2014) {
            System.out.println("Обычная версия для Android");
        } else if(clientOS == 0 && releaseDate<2015){
            System.out.println("Облегченная версия для IOS");
        }   else{
            System.out.println("Облегченная версия для Andrsoid");
        }
    }

    public static void delieveryCard(int deliveryDistance) {
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        } else if(deliveryDistance>19 && deliveryDistance<61){
            System.out.println("Потребуется дней: 2");
        }   else{
            System.out.println("Потребуется дней: 3");
        }
    }
}