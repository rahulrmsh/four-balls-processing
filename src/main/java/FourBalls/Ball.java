package FourBalls;

public class Ball {
    private final int speed;
    private int xPos;
    private final int yPos;

    public Ball(int speed, int yPos) {
        this.speed = speed;
        this.xPos = 0;
        this.yPos = yPos;
    }

    public int getSpeed() {  //getters and setters
        return speed;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

}
