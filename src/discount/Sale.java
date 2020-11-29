package discount;

public class Sale implements DiscountStrategy {

    @Override
    public double getDiscount(double billAmount) {
        return (billAmount - (billAmount * 0.1));
    }

}
