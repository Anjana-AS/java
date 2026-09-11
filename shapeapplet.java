package anjana;

import java.applet.Applet;
import java.awt.Graphics;

public class shapeapplet extends Applet {

    public void paint(Graphics g) {

        // Draw circle
        g.drawOval(50, 50, 100, 100);

        // Draw triangle
        int x[] = {200, 150, 250};
        int y[] = {50, 150, 150};

        g.drawPolygon(x, y, 3);
    }
}
