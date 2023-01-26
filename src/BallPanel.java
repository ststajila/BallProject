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
//        int x, y, xs, ys, x1, y1, x1s, y1s;
//        int count = 0;
//        do{
//            int i = 0;
//                x = balls[i].getX();
//                y = balls[i].getY();
//                xs = balls[i].getX() + balls[i].getBallSize();
//                ys = balls[i].getY() + balls[i].getBallSize();
//
//            for (int a = 1; a < 20; a++){
//                x1 = balls[a].getX();
//                y1 = balls[a].getY();
//                x1s = balls[a].getX() + balls[a].getBallSize();
//                y1s = balls[a].getY() + balls[a].getBallSize();
//
//                if (xs == x && y == ys || ) {
//                    balls[a].changeSpeed();
//                    balls[i].changeSpeed();
//                };
//            };
//
//            i++;
//            count++;
//        } while(count == 20);
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

        repaint();

    }
}