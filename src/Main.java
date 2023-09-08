public class Main {
    public static void main(String[] args) {
        double currentBalance = 100;
        double depositAmount = 1100;
        double minDepositAmount = 1000;
        int bonusAmount = 0;
        boolean meetsMinimumDeposit = depositAmount >= minDepositAmount;
        if (meetsMinimumDeposit) {
            bonusAmount = (int) (depositAmount / minDepositAmount);
            boolean hasFractionalPart = depositAmount % minDepositAmount != 0;
            if (hasFractionalPart) {
                bonusAmount++;
            }
        }
        double finalBalance = currentBalance + depositAmount + bonusAmount;
        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusAmount);
    }
}
