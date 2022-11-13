package good.design.policy;

public interface ExcellentCustomerRule {

  boolean ok(PurchaseHistory history);
}
