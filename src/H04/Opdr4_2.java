package H04;
import java.awt.*;
import java.applet.*;

public class Opdr4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.yellow);
        g.drawRect(70,70,60,60);
        g.drawRect(50,60,200,200);
        g.drawRect(130,200,40,60);

    }
}