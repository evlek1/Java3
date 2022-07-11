public class Main {
    public static void main(String[] args) {
        int Refill = 200;
        int Account = 100;
        if(Refill >= 1000){
            System.out.println("Количество бонусов равно " + (Refill / 100));
            System.out.println("Состояние счета " + (Refill + Refill / 100));
        }
        else{
            System.out.println("Количество бонусов равно 0");
            System.out.println("Состояние счета " + (Refill + Account));
        }

    }
}
