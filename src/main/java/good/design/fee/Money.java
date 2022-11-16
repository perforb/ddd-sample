package good.design.fee;

public record Money(int amount) {

  public Money add(Money other) {
    return new Money(amount() + other.amount());
  }
}
