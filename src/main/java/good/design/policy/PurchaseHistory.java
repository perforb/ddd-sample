package good.design.policy;

public record PurchaseHistory(
  int totalAmont,
  int purchaseFrequencyPerMonth,
  double returnRate
) {
}
