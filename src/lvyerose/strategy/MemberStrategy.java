package lvyerose.strategy;

/**
 * 使用接口 或者 抽象类定义算法集的根类
 * Created by lvyeRose on 17/3/30.
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格 根据不同的人进行不同的打折
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    double calcPrice(double booksPrice);
}
