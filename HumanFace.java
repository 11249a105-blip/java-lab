import java.applet.Applet;
import java.awt.*;

public class HumanFace extends Applet
{
    public void paint(Graphics g)
    {
        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 200);

        // Draw left eye
        g.setColor(Color.BLACK);
        g.fillOval(150, 110, 20, 20);

        // Draw right eye
        g.fillOval(230, 110, 20, 20);

        // Draw nose
        g.drawLine(200, 130, 190, 170);
        g.drawLine(190, 170, 210, 170);

        // Draw mouth
        g.drawArc(160, 160, 80, 50, 180, 180);
    }
}
