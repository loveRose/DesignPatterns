package lvyerose.builder;

/**
 * Created by lvyeRose on 16/12/16.
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }

}
