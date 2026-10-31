
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="GeometricShapes.class" width="500" height="400">
</applet>
*/

public class GeometricShapes extends Applet {

    public void paint(Graphics g) {

        // Set background color
        setBackground(Color.white);

        // Draw Rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 120, 70);
        g.drawString("Rectangle", 75, 140);

        // Draw Circle
        g.setColor(Color.BLUE);
        g.drawOval(220, 50, 100, 100);
        g.drawString("Circle", 250, 170);

        // Draw Line
        g.setColor(Color.GREEN);
        g.drawLine(50, 220, 180, 220);
        g.drawString("Line", 100, 240);

        // Draw Triangle
        g.setColor(Color.MAGENTA);

        int x[] = {250, 200, 300};
        int y[] = {200, 300, 300};

        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 235, 320);
    }
}
