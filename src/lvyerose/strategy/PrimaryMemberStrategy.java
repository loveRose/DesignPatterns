package lvyerose.strategy;

/**
 * Created by lvyeRose on 17/3/30.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
