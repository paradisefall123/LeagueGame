import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Dog extends GameObject{
    public static BufferedImage image;
    public static boolean needImage = true;
    public static boolean gotImage = false;
    private int xVelocity = 5;
    int gravity = 1;
    int yVelocty = 0;
    int jumpPower = 20;
    int yLimit = 400;

    boolean canJump = false;
    Dog(int x, int y, int width, int height) {
        super(x, y, width, height);
        if (needImage) {
            loadImage("dog.png");
        }
    }

    public void jump(){
        if(canJump){
            yVelocty -= jumpPower;
            canJump = false;
        }
    }

    public void update(Graphics g){
        super.update();
        updateDog(g);
        updateJump();

    }
    void updateDog(Graphics g){
        if (gotImage) {
            g.drawImage(image, x, y-20, 100, 100, null);
        } else {
            g.setColor(Color.BLUE);
            g.fillRect(x, y, width, height);
        }
    }
    void loadImage(String imageFile) {
        if (needImage) {
            try {
                image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
                gotImage = true;
            } catch (Exception e) {

            }
            needImage = false;
        }
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
