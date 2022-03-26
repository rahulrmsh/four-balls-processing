package FourBalls;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBalls extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    private final List<Ball> balls;

    public FourBalls() {
        
        balls = new ArrayList<>();

        balls.add(new Ball(1, HEIGHT * (1 / 5)));
        balls.add(new Ball(2, HEIGHT * (2 / 5)));
        balls.add(new Ball(3, HEIGHT * (3 / 5)));
        balls.add(new Ball(4, HEIGHT * (4 / 5)));
    }

    public static void main(String[] args){
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        updatePosition();
        drawBalls();
    }

    void updatePosition() {
        for (Ball ball : balls) {  //type Balls of balls list
            int newXPos = ball.getXPos() + ball.getSpeed();
            ball.setXPos(newXPos);
        }
    }
    void drawBalls(){
        for(Ball ball: balls){
            drawCircle(ball.getXPos(), ball.getYPos());
        }
    }

    private void drawCircle(int xPos, int yPos) {
        ellipse(xPos, yPos, DIAMETER, DIAMETER);
    }
}
