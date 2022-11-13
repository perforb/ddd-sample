package good.design.policy;

public class SilverCustomerPolicy {

  private final ExcellentCustomerPolicy policy;

  SilverCustomerPolicy() {
    this.policy = new ExcellentCustomerPolicy();
    policy.add(new PurchaseFrequencyRule());
    policy.add(new ReturnRateRule());
  }

  boolean complyWithAll(PurchaseHistory history) {
    return policy.complyWithAll(history);
  }
}
