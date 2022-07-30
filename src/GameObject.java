import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject {
    public BufferedImage image;
    public boolean needImage = true;
    public boolean gotImage = false;
    int x;
    int y;
    int width;
    int height;
    int speed=0;
    boolean isActive= true;
    GameObject(int mx, int my, int mwidth, int mheight){
    x=mx;
    y=my;
    width=mwidth;
    height=mheight;
    }

    void update(){

    }
    void draw(Graphics g) {
        if (gotImage) {
            g.drawImage(image, x, y, width, height, null);
        } else {
            g.setColor(Color.MAGENTA);
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
