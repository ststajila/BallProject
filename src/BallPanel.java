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

        // New Code
        /*int x;
        int y;
        int x1;
        int y1;
        int count = 0;
        do{
            int i = 0;
                x = balls[i].getX();
                y = balls[i].getY();

            for (int a = 1; a < 20; a++){
                x1 = balls[a].getX();
                y1 = balls[a].getY();
                if ( x1 == x + balls[i].getBallSize() && y1 <= y && y <= y1 + balls[a].getBallSize()
                ) {
                    balls[a].changeSpeed();
                    balls[i].changeSpeed();
                }
            };

            i++;
            count++;
        } while(count == 20);*/


        repaint();

    }
}