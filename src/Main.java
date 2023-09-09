public class Main {
    public static void main(String[] args) {
        double currentBalance = 100;
        double depositAmount = 1100;
        double minDepositAmount = 100;
        int bonusAmount = 0;
        boolean meetsMinimumDeposit = depositAmount >= minDepositAmount;
        if (meetsMinimumDeposit) {
            bonusAmount = (int) (depositAmount / minDepositAmount);
        }
        double finalBalance = currentBalance + depositAmount + bonusAmount;
        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusAmount);
    }
}