import java.awt.*;

public class Tree extends Obstacle {
    Tree(int x, int y, int mwidth, int mheight) {
        super(x, y, mwidth, mheight);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }

}
