package good.design.discount;

public class DiscountedSummerPrice {

  private static final int DISCOUNT_AMOUNT = 300;
  private final int amount;

  public DiscountedSummerPrice(RegularPrice price) {
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
