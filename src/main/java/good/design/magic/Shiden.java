package good.design.magic;

public class Shiden implements Magic {

  private final Member member;

  public Shiden(Member member) {
    this.member = member;
  }

  @Override
  public String name() {
    return "Shiden";
  }

  @Override
  public MagicPoint costMagicPoint() {
    int value = 5 + (int) (member.level() * 0.2);
    return new MagicPoint(value);
  }

  @Override
  public AttackPower attackPower() {
    int value = 50 + (int) (member.agility() * 1.5);
    return new AttackPower(value);
  }

  @Override
  public TechnicalPoint costTechnicalPoint() {
    return new TechnicalPoint(5);
  }
}
