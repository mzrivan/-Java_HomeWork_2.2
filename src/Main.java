public class Main {
    public static void main(String[] args) {

        int clientAccount = 256; //начальная сумма счёта
        int refill = 1024; //сумма пополнения
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
            clientAccount = clientAccount + refill + bonus;
            System.out.println("Начислено бонусов: " + bonus);
            System.out.println("Итоговый счёт: " + clientAccount);
        } else {
            clientAccount = clientAccount + refill;
            System.out.println("Итоговый счёт: " + clientAccount);
        }
    }
}