package good.design.fee;

public class RegularRates implements HotelRates {

  @Override
  public Money fee() {
    return new Money(7000);
  }

  @Override
  public Money busySeasonFee() {
    return fee().add(new Money(3000));
  }
}
