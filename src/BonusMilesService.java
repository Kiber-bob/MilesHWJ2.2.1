public class BonusMilesService {
    public int calculate(int priceTicket) {
        int mileBonus = 2_000;
        int totalMile = priceTicket / mileBonus;

        return totalMile;
    }

}
