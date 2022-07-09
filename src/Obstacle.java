import java.awt.*;

public class Obstacle extends GameObject {
    int m_speed = 0;

    Obstacle(int mx, int my, int mwidth, int mheight) {
        super(mx, my, mwidth, mheight);

    }

     public void draw(Graphics g) {
        update(g);
    }

    void move() {
        x = x - 1;
    }

    void updateObstacle(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    void update(Graphics g) {
        updateObstacle(g);
        move();
    }
}
