import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/08/24.
 */
public class mainFrame {
    public static void main(String[] args){
        //System.out.println("Hello, World!");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ButtonFrame bf = new ButtonFrame();

                //basic setting for frame.
                bf.setTitle("ButtonFrameTest");
                bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                bf.setVisible(true);

                //make buttons with assistant method and anonymous class.
                bf.makeButton("Yellow", Color.YELLOW);
                bf.makeButton("Blue", Color.BLUE);
                bf.makeButton("Red", Color.RED);
            }
        });
    }
}
