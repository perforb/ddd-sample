package good.design.policy;

public class GoldCustomerPurhcaseAmountRule implements ExcellentCustomerRule {

  @Override
  public boolean ok(PurchaseHistory history) {
    return 100_000 <= history.totalAmont();
  }
}
