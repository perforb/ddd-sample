package good.design.policy;

public class ReturnRateRule implements ExcellentCustomerRule {

  @Override
  public boolean ok(PurchaseHistory history) {
    return history.returnRate() <= 0.001;
  }
}
