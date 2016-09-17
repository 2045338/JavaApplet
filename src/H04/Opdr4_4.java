package H04;

import java.applet.Applet;
import java.awt.*;


public class Opdr4_4 extends Applet {

    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(80,80,80,340);
        g.setColor(Color.black);
        g.fillRect(100,240,50,100);
        g.setColor(Color.blue);
        g.fillRect(170,140,50,200);
        g.setColor(Color.red);
        g.fillRect(240,100,50,240);
        g.setColor(Color.black);
        //namen
        g.drawString("Valerie",105,360);
        g.setColor(Color.blue);
        g.drawString("Hans",175,360);
        g.setColor(Color.red);
        g.drawString("Jeroen",245,360);
        //nummers
        g.setColor(Color.gray);
        g.drawString("20",60,300);
        g.setColor(Color.gray);
        g.drawString("40",60,250);
        g.setColor(Color.gray);
        g.drawString("60",60,190);
        g.setColor(Color.gray);
        g.drawString("80",60,130);
        g.setColor(Color.gray);
        g.drawString("100",55,80);








    }
}