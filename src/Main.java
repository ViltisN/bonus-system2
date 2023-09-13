public class Main {
    public static void main(String[] args) {
        double currentBalance = 100;
        double depositAmount = 1100;
        double minDepositAmount = 100;

        if (depositAmount >= minDepositAmount) {
            int bonusAmount = (int) (depositAmount / minDepositAmount);
            double finalBalance = currentBalance + depositAmount + bonusAmount;

            System.out.println("Итоговый счёт: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: " + bonusAmount);
        } else {
            double finalBalance = currentBalance + depositAmount;

            System.out.println("Итоговый счёт: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: 0");
        }
    }
}