package lvyerose.strategy;

/**
 * 策略者模式
 * Created by lvyeRose on 17/3/30.
 */
public class StrategyTest {
    public static void main(String[] args) {
        double bookPrice = 300;
        //选择并创建需要使用的策略对象
        MemberStrategy advancedMemberStrategy = new AdvancedMemberStrategy();
        MemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();
        MemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy();
        //创建使用环境
        Price price = new Price(advancedMemberStrategy);
        //计算价格
        double quote = price.quote(bookPrice);
        System.out.println("高级会员图书的最终价格为：" + quote);

        //唯一不同之处是  选择不同的策略对象
        price = new Price(intermediateMemberStrategy);
        quote = price.quote(bookPrice);
        System.out.println("中级会员图书的最终价格为：" + quote);

        //唯一不同之处是  选择不同的策略对象
        price = new Price(primaryMemberStrategy);
        quote = price.quote(bookPrice);
        System.out.println("初级会员图书的最终价格为：" + quote);
    }
}
