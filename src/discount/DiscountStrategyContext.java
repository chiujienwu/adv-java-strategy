package discount;

public class DiscountStrategyContext {

    private DiscountStrategy discountStrategy;

    public DiscountStrategyContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double executeDiscountStrategy (double billAmount) {
        return discountStrategy.getDiscount(billAmount);
    }
}
