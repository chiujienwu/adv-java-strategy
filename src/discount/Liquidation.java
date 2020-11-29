package discount;

public class Liquidation implements DiscountStrategy {

    @Override
    public double getDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }

}
