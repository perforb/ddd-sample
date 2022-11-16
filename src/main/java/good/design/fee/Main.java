package good.design.fee;

import java.util.HashMap;
import java.util.Map;

import static good.design.fee.RatesType.PREMIUM;
import static good.design.fee.RatesType.REGULAR;

public class Main {

  private final Map<RatesType, HotelRates> hotelRates;

  public Main() {
    hotelRates = new HashMap<>();
    hotelRates.put(REGULAR, new RegularRates());
    hotelRates.put(PREMIUM, new PremiumRates());
  }

  public static void main(String[] args) {
    Main main = new Main();
    for (RatesType t : RatesType.values()) {
      HotelRates rates = main.hotelRates.get(t);
      System.out.println("fee(): " + rates.fee());
      System.out.println("busySeasonFee(): " + rates.busySeasonFee());
      System.out.println("---");
    }
  }
}
