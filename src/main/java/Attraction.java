public abstract class Attraction implements IEnjoyable {

    private String name;
    private int funRating;
    private double price;

    public Attraction(String name, int funRating, double price){
        this.name = name;
        this.funRating = funRating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getFunRating() {
        return funRating;
    }

    public double getPrice() {
        return price;
    }
}
