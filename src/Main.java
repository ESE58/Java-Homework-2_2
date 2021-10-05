public class Main {

    public static void main(String[] args) {
        int amountInitial = 200;
        int payment = 1300;
        int countValue = 100;
        int countBonus = payment / countValue;
        int bonusValue = 1;
        int bonus;

            if (payment > 1000) {
        bonus = countBonus * bonusValue;
        } else {
            bonus = 0;
        }

        int newAmount = amountInitial + payment + bonus;

        System.out.println("Итоговый счет: " + newAmount + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");

    }
}
