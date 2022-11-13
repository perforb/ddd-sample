package good.design.policy;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<PurchaseHistory>  histories = List.of(
      new PurchaseHistory(110000, 100, 0),
      new PurchaseHistory(50000, 100, 0),
      new PurchaseHistory(0, 0, 0)
    );

    GoldCustomerPolicy goldCustomerPolicy = new GoldCustomerPolicy();
    SilverCustomerPolicy silverCustomerPolicy = new SilverCustomerPolicy();

    for (PurchaseHistory history : histories) {
      System.out.println("Gold?: " + goldCustomerPolicy.complyWithAll(history));
      System.out.println("Silver?: " + silverCustomerPolicy.complyWithAll(history));
      System.out.println("---");
    }
  }
}
