package good.design.magic;

public class HellFire implements Magic {

  private final Member member;

  public HellFire(Member member) {
    this.member = member;
  }

  @Override
  public String name() {
    return "HellFire";
  }

  @Override
  public MagicPoint costMagicPoint() {
    return new MagicPoint(16);
  }

  @Override
  public AttackPower attackPower() {
    int value = 200 + (int) (member.magicAttack() * 0.5 + member.vitality() * 2);
    return new AttackPower(value);
  }

  @Override
  public TechnicalPoint costTechnicalPoint() {
    int value = 200 + (int) (member.level() * 0.4);
    return new TechnicalPoint(value);
  }
}
