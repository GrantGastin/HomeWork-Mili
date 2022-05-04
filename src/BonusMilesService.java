public class BonusMilesService {
    public static int calculate(int cost) {
        int bonusScale = 25;
        int bonusMile = cost / bonusScale;
        return bonusMile; // возвращаем рассчитанное кол-во бонусных миль


    }
}
