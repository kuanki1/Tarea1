package model.items;

/**
 * This class represents a MagicBookAnima type item.
 * <p>
 * MagicBookAnima are strong against MagicBookLuz and weak against MagicBookOscuridad.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class MagicBookAnima extends AbstractItem {

  /**
   * Creates a new MagicBookAnima.
   *
   * @param name
   *     the name that identifies the weapon
   * @param power
   *     the base damage pf the weapon
   * @param minRange
   *     the minimum range of the weapon
   * @param maxRange
   *     the maximum range of the weapon
   */
  public MagicBookAnima(final String name, final int power, final int minRange, final int maxRange) {
    super(name, power, minRange, maxRange);
  }
}
