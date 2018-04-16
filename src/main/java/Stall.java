public abstract class Stall implements IChargeable, IEnjoyable {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int funRating;
    private int price;

    public Stall(String name, String ownerName, int parkingSpot, int funRating, int price){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = funRating;
        this.price = price;
    }

    public String getStallName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getFunRating() {
        return funRating;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return getPrice();
    }

    @Override
    public String getName() {
        return name;
    }
}
