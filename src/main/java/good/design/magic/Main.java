package good.design.magic;

import java.util.HashMap;
import java.util.Map;

import static good.design.magic.MagicType.FIRE;
import static good.design.magic.MagicType.HELL_FIRE;
import static good.design.magic.MagicType.SHIDEN;

public class Main {

  private final Map<MagicType, Magic> magics;

  public Main(Member member) {
    this.magics = new HashMap<>();
    magics.put(FIRE, new Fire(member));
    magics.put(SHIDEN, new Shiden(member));
    magics.put(HELL_FIRE, new HellFire(member));
  }

  public static void main(String[] args) {
    Member member = new Member(3, 10, 8, 80);
    Main main = new Main(member);
    main.magicAttack();
  }

  void magicAttack() {
    magics.forEach((k, v) -> {
      showMagicName(v);
      showMagicPoint(v);
      showAttackPower(v);
      showTechnicalPoint(v);
      System.out.println("---");
    });
  }

  void showMagicName(Magic magic) {
    System.out.println(magic.name());
  }

  void showMagicPoint(Magic magic) {
    System.out.println(magic.costMagicPoint().value());
  }

  void showAttackPower(Magic magic) {
    System.out.println(magic.attackPower().value());
  }

  void showTechnicalPoint(Magic magic) {
    System.out.println(magic.costTechnicalPoint().value());
  }
}
