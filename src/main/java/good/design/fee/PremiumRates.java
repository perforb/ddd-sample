package good.design.fee;

public class PremiumRates implements HotelRates {

  @Override
  public Money fee() {
    return new Money(12000);
  }

  @Override
  public Money busySeasonFee() {
    return fee().add(new Money(5000));
  }
}
