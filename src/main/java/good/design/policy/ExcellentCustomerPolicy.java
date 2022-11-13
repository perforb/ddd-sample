package good.design.policy;

import java.util.HashSet;
import java.util.Set;

public class ExcellentCustomerPolicy {

  private final Set<ExcellentCustomerRule> rules;

  ExcellentCustomerPolicy() {
    this.rules = new HashSet<>();
  }

  void add(ExcellentCustomerRule rule) {
    this.rules.add(rule);
  }

  boolean complyWithAll(PurchaseHistory history) {
    for (ExcellentCustomerRule rule : rules) {
      if (!rule.ok(history)) {
        return false;
      }
    }
    return true;
  }
}
