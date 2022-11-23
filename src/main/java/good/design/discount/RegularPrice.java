package good.design.discount;

public record RegularPrice(int amount) {

  public RegularPrice {
    if (amount < 0) {
      throw new IllegalArgumentException("must not be less than 0.");
    }
  }
}
