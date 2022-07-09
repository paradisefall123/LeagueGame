import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font subscript;
    Timer frameDraw;
    Dog dog=new Dog(50,400,50,50);
    Tree tree= new Tree(600,420, 20,20);
    GamePanel(){
        titleFont = new Font("Arial", Font.PLAIN, 48);
        subscript= new Font("Arial", Font.PLAIN,30);
        frameDraw = new Timer(1000/60,this);
        frameDraw.start();
    }
    void updateMenuState() {

    }

    void updateGameState() {

    }

    void updateEndState() {

    }

    void drawMenuState(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(0,0, OnTheRun.Width, OnTheRun.Height);

        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString("Dog On The Run!", 200,100);

        g.setFont(subscript);
        g.setColor(Color.black);
        g.drawString("Press ENTER to start", 250,200);
        g.drawString("Press SPACE for instructions", 210,300);
    }

    void drawGameState(Graphics g) {
       drawBackground(g);
       drawGame(g);
    }

    void drawEndState(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0,0, OnTheRun.Width, OnTheRun.Height);

        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString("GAME OVER", 250,220);
    }
    void drawBackground(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0,0, OnTheRun.Width, OnTheRun.Height);
    }

    void drawGame(Graphics g){
        dog.draw(g);
        tree.draw(g);
    }
    @Override
    public void paintComponent(Graphics g) {

        if (currentState == MENU) {
            drawMenuState(g);
        } else if (currentState == GAME) {
            drawGameState(g);
        } else if (currentState == END) {
            drawEndState(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(currentState == MENU){
            updateMenuState();
        }else if(currentState == GAME){
            updateGameState();


        }else if(currentState == END){
            updateEndState();
        }
        //System.out.println("action");
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){
        if(currentState==END){
            currentState=MENU;
        } else{
            currentState++;
        }
    }if(e.getKeyCode()==KeyEvent.VK_SPACE || e.getKeyCode()==KeyEvent.VK_UP){
            dog.jump();
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
