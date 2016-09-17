package H02;

import java.applet.Applet;
import java.awt.*;


public class Opdr2_2 extends Applet {


    public void init() {
        setBackground(Color.white);


    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Okan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Dagli", 50, 80 );

    }

}

