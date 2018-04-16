public class RollerCoaster extends Attraction implements IChargeable, IRestrictable {

    public RollerCoaster (String name, int funRating, double price){
        super(name, funRating, price);
    }

    @Override
    public double priceFor(Visitor visitor) {
       return (visitor.getAge() <= 12) ? getPrice()/2.0 :getPrice()  ;
    }

    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 12 && visitor.getHeight() >= 145 );
    }


}
