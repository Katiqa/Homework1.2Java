public class Main {
    public static void main(String[] args) {
        int client = 800; //сколько на счету
        int plus = 300; //пополнение
        int all = client+plus; //итого

        int bonus = all / 100;
        if (plus > 1000) {
            System.out.println("Итого: " + all + ',' + "Бонусные рубли = " + bonus);
        } else {
            System.out.println("Итого: " + all + ',' + "Бонусов нет");
        }
    }
}