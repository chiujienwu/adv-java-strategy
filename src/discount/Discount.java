package discount;

public class Discount implements DiscountStrategy {

    @Override
    public double getDiscount (double billAmount) {
        return billAmount - (billAmount * 0.5);
    }

}
