public class Main {
    public static void main(String[] args) {
        double tiketPrice = 13_750;
        int milePrice = 20;
        int receivedMiles = (int) tiketPrice / milePrice;

        System.out.println("Начислено миль - " + receivedMiles);
    }
}
