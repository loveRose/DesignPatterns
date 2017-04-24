package lvyerose.observer;

/**
 * Created by lvyeRose on 17/3/5.
 */
public class SimpleTest {
    public static void main(String[] args) {
        //杂志社 被观察对象
        MagazineChanged observable = new MagazineChanged();

        //需要接收被观察者变化的对象，观察者
        Coder coder1 = new Coder("Coder1");
        Coder coder2 = new Coder("Coder2");
        Coder coder3 = new Coder("Coder3");
        Coder coder4 = new Coder("Coder4");
        Coder coder5 = new Coder("Coder5");

        //将观察者注册到被观察者（可观察）对象的观察列表中
        observable.addObserver(coder1);
        observable.addObserver(coder2);
        observable.addObserver(coder3);
        observable.addObserver(coder4);
        observable.addObserver(coder5);

        observable.postNewChanged("《这个是新内容发生了变化》");
    }
}
