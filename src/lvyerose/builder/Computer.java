package lvyerose.builder;

/**
 * Created by lvyeRose on 16/12/16.
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public String getBoard() {
        return mBoard;
    }

    //设置CPU核心数
    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public String getDisplay() {
        return mDisplay;
    }

    //设置内存
    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public String getmOS() {
        return mOS;
    }

    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}







