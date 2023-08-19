// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 400;
        int replenishment = 1000;
        int bonus;

        if (replenishment >= 1000) {
            bonus = (replenishment / 100);
        } else {
            bonus = 0;
        }
        System.out.println("Счёт = " + (account + replenishment + bonus));
        System.out.println("Бонусов = " + bonus);
    }
}