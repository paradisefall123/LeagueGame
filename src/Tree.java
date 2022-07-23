import java.awt.*;

public class Tree extends GameObject {


    Tree(int mx, int my, int mwidth, int mheight) {
        super(mx, my, mwidth, mheight);
        speed=1;

    }
    void update() {

        super.update();

    }
  void draw(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }


    }

