public class TobaccoShop extends Stall implements IRestrictable {


    public TobaccoShop(String stallName, String ownerName, int parkingSpot, int funRating, int price) {
        super(stallName, ownerName, parkingSpot, funRating, price);
    }

    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 18);
    }
}
