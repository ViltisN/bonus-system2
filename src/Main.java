public class Main {
    public static void main(String[] args) {
        double ticketPrice = 13676;
        int rublesPerMile = 20;
        int miles = (int) (ticketPrice / rublesPerMile);
        boolean hasDecimalPart = ticketPrice % rublesPerMile != 0;
        if (hasDecimalPart) {
            miles++;
        }
        System.out.println("Количество начисленных миль: " + miles);
    }
}
