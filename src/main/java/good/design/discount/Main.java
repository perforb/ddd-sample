package good.design.discount;

public class Main {

  public static void main(String[] args) {
    RegularPrice regularPrice = new RegularPrice(1000);
    DiscountedRegularPrice discountedRegularPrice
      = new DiscountedRegularPrice(regularPrice);
    DiscountedSummerPrice discountedSummerPrice
      = new DiscountedSummerPrice(regularPrice);

    System.out.println("discountedRegularPrice: " + discountedRegularPrice.amount());
    System.out.println("discountedSummerPrice: " + discountedSummerPrice.amount());
  }
}
