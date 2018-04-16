public class Dodgems extends Attraction implements IChargeable {

    public Dodgems (String name, int funRating, double price){
        super(name, funRating, price);
    }

    @Override
    public double priceFor(Visitor visitor) {
        return (visitor.getAge() <= 12) ? getPrice()/2.0 :getPrice()  ;
    }

}