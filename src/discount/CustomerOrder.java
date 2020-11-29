package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getBillAmount() {
        double tempBill;
        DiscountStrategyContext discountStrategyContext;

        switch (discountType) {
            case 'S':
            case 's':
//                tempBill = billAmount - (billAmount * 0.1);
                discountStrategyContext = new DiscountStrategyContext(new Sale());
                tempBill = discountStrategyContext.executeDiscountStrategy(billAmount);
                break;
            case 'D':
            case 'd':
//                tempBill = billAmount - (billAmount * 0.5);
                discountStrategyContext = new DiscountStrategyContext(new Discount());
                tempBill = discountStrategyContext.executeDiscountStrategy(billAmount);
                break;
            case 'L':
            case 'l':
//                tempBill = billAmount - (billAmount * 0.75);
                discountStrategyContext = new DiscountStrategyContext(new Liquidation());
                tempBill = discountStrategyContext.executeDiscountStrategy(billAmount);
                break;
            default:
                tempBill = billAmount;
        }

        return tempBill;


    }


//    public double getBillAmount() {
//        return billAmount;
//    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }


}
