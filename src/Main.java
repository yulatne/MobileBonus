public class Main {
    public static void main(String[] args) {
        int cash = 120;
        int sum = 1500;
        int bonus;
        int percent = 1;
        if (sum <= 1000) {
            bonus = 0;
        } else {
            bonus = sum * percent / 100;
        }
        int totalBonus = cash + sum + bonus;
        System.out.println(totalBonus);
    }
}
