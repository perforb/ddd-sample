package good.design.discount;

public class DiscountedRegularPrice {

  private static final int DISCOUNT_AMOUNT = 400;
  private final int amount;

  public DiscountedRegularPrice(RegularPrice price) {
    int discountedAmount = price.amount() - DISCOUNT_AMOUNT;
    if (discountedAmount < 0) {
      discountedAmount = 0;
    }
    this.amount = discountedAmount;
  }

  public int amount() {
    return amount;
  }
}
