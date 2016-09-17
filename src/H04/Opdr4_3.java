package H04;

import java.applet.Applet;
import java.awt.*;


public class Opdr4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(30, 50, 200, 50);
        g.setColor(Color.white);
        g.fillRect(60,100,200,50);
        g.setColor(Color.blue);
        g.fillRect(30,150,200,50);
        g.setColor(Color.gray);
        g.fillRect(30,200,10,160);



    }

 }