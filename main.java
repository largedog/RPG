import javax.swing.*;
import java.awt.*;

/**
 * Created by IGMAdmin on 7/10/2017.
 */
public class main extends JFrame{

    final int width;
    final int height;
    final int fps;

        public main(int width, int height, int fps){
          super();

            this.width = width;
             this.height = height;
             this.fps = fps;
        }
          void init () {
            setPreferredSize(new Dimension (height, width));
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            setBounds(0, 0, width, height);
            setIgnoreRepaint(true);

            setVisible(true);
createBufferStrategy(2);
strategy = getBufferStrategy();

          }

          public void run () {
            init();


          }


    public static void  main (String args )[]

}
