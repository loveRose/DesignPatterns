package lvyerose.observer;

import java.util.Observable;

/**
 * Created by lvyeRose on 17/3/5.
 */
public class MagazineChanged extends Observable {

    public void postNewChanged(String content) {
        setChanged();
        notifyObservers(content);
    }
}
