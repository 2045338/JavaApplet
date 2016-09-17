package H04;
import java.awt.*;
import java.applet.*;

public class Opdr4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
       g.fillRoundRect(20,20,100,100,20,20);
        g.setColor(Color.black);
        g.fillRoundRect(35,30,25,25,40,40);
        g.setColor(Color.black);
        g.fillRoundRect(35,80,25,25,40,40);
        g.setColor(Color.black);
        g.fillRoundRect(80,80,25,25,40,40);
        g.setColor(Color.black);
        g.fillRoundRect(80,30,25,25,40,40);

    }
}