import javax.imageio.ImageIO;
import java.awt.*;

public class Obstacle extends GameObject{


    Obstacle(int x, int y, int width, int height) {
        super(x, y, width, height);
        speed=1;
        if (needImage) {
            loadImage("mailbox.png");
        }
    }

    void draw(Graphics g) {
        update(g);
    }

    void move() {
        x = x - speed;
    }

    void updateObstacle(Graphics g) {
        if (gotImage) {
            g.drawImage(image, x, y, width, height, null);
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

    void update(Graphics g) {
        super.update();
        updateObstacle(g);
        move();

    }
}
