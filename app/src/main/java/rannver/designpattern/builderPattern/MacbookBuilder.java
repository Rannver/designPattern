package rannver.designpattern.builderPattern;

/**
 * Created by Rannver on 2018/3/14.
 */

public class MacbookBuilder extends Builder {

    private Computer computer = new Macbook();

    @Override
    public Builder buildBoard(String board) {
        computer.setBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        computer.setDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        computer.setOs();
        return this;
    }

    @Override
    public Computer create() {
        return computer;
    }
}
