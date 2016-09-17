package H04;
import java.awt.*;
import java.applet.*;

public class Opdr4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.yellow);
        g.drawLine(70,150,270,250);
        g.drawLine(70,150,270,50);
        g.drawLine(270,250,270,50);
        }
    }



