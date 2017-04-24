package lvyerose.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lvyeRose on 17/3/5.
 */
public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi," + name + ",内容:" + arg + "更新了");
    }
}
