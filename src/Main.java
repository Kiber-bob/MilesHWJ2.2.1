public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket = 10_000;
        int totalMiles = service.calculate(priceTicket);
        System.out.println("totalMiles: " + totalMiles);
    }
}


