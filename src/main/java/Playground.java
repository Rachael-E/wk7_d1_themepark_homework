public class Playground extends Attraction implements IRestrictable {

    private String name;
    private int funRating;
    private double price;

    public Playground (String name, int funRating, double price){
        super(name, funRating, price);
    }


    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() < 15);
    }

}
