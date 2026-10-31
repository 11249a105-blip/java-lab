import java.applet.Applet;
import java.awt.*;

/* <applet code="Shapes.class" width="400" height="300">
   </applet> */

public class Shapes extends Applet
{
    public void paint(Graphics g)
    {
        // Draw a red rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 120, 60);

        // Draw a blue oval
        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 120, 60);

        // Display message in bold font
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 70, 180);
    }
}
