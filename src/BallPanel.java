import javax.swing.*;
import java.awt.*;
public class BallPanel extends JPanel{

    private Ball ball = new Ball(0, 0, 23, 1, 1, Color.WHITE);
    private Ball[] balls = new Ball[20];


    public BallPanel(){

        setBackground(new Color(203, 203, 203));

        for (int i = 0; i < 20; i++){
            balls[i] = new Ball();
        }
    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i < 20; i++){
            balls[i].drawBall(g);
            balls[i].moveBall(this);
        }

        repaint();

    }
}