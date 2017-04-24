package lvyerose.builder;

/**
 * Created by lvyeRose on 16/12/16.
 */
public class FinalComputer {
    private String OS;
    private String display;
    private String board;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public static class Builder {
        FinalComputer finalComputer = new FinalComputer();

        public Builder display(String display) {
            finalComputer.setDisplay(display);
            return this;
        }

        public Builder OS(String OS) {
            finalComputer.setOS(OS);
            return this;
        }

        public Builder board(String board) {
            finalComputer.setBoard(board);
            return this;
        }

        public FinalComputer build() {
            return finalComputer;
        }
    }

    @Override
    public String toString() {
        return "FinalComputer{" +
                "OS='" + OS + '\'' +
                ", display='" + display + '\'' +
                ", board='" + board + '\'' +
                '}';
    }
}
