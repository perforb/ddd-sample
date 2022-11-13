package good.design.policy;

public class GoldCustomerPolicy {

  private final ExcellentCustomerPolicy policy;

  GoldCustomerPolicy() {
    this.policy = new ExcellentCustomerPolicy();
    policy.add(new GoldCustomerPurhcaseAmountRule());
    policy.add(new PurchaseFrequencyRule());
    policy.add(new ReturnRateRule());
  }

  boolean complyWithAll(PurchaseHistory history) {
    return policy.complyWithAll(history);
  }
}
