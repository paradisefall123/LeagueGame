import java.awt.*;

public class Dog extends GameObject{


    private int xVelocity = 5;
    int gravity = 1;
    int yVelocty = 0;
    int jumpPower = 20;
    int yLimit = 400;

    boolean canJump = false;
    Dog(int x, int y, int width, int height) {
        super(x, y, width, height);

    }
    public void jump(){
        if(canJump){
            yVelocty -= jumpPower;
            canJump = false;
        }
    }

    public void update(Graphics g){
        updateDog(g);
        updateJump();
    }
    void updateDog(Graphics g){
        g.setColor(Color.MAGENTA);
        g.fillRect(x, y, width, height);
    }

    void updateJump(){
        yVelocty += gravity;
        y += yVelocty;

        if(y >= yLimit){
            y = yLimit;
            yVelocty = 0;
            canJump = true;
        }
    }
    void draw(Graphics g){
        update(g);
    }

}
