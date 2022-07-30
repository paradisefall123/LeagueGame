import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Tree extends GameObject {
    public static BufferedImage image;
    public static boolean needImage = true;
    public static boolean gotImage = false;

    Tree(int x, int y, int width, int height) {
        super(x, y, width, height);
        speed=20;
        if (needImage) {
            loadImage("tree.png");
        }

    }
    void update() {
        super.update();
        x-= speed;
        System.out.println("Update");

    }
  void draw(Graphics g){
      if (gotImage) {
          g.drawImage(image, x, y-50, 100, 100, null);
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

    }

