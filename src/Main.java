public class Main {
    public static void main(String[] args) {
        int refill = 200;
        int account = 100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
            System.out.println("Количество бонусов равно " + (bonus));
            System.out.println("Состояние счета " + ((refill) + (account) + (bonus)));
        } else {
            System.out.println("Количество бонусов равно 0");
            System.out.println("Состояние счета " + (refill + account));
        }

    }
}
