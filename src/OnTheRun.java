import javax.swing.*;

public class OnTheRun {
    JFrame frame;
    GamePanel panel;
    public static final int Width =800;
    public static final int Height = 500;

    public static void main(String[] args) {
        OnTheRun setupFrame= new OnTheRun();
        setupFrame.setup();
    }

    OnTheRun(){
        frame= new JFrame();
        panel= new GamePanel();
    }

   void setup(){
         frame.add(panel);
         frame.addKeyListener(panel);
         frame.setVisible(true);
         frame.setSize(Width, Height);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
