import java.awt.*;

public class Tree extends Obstacle {
    Tree(int x, int my, int mwidth, int mheight) {
        super(x, my, mwidth, mheight);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }

}
