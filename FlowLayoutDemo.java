import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame
{
    FlowLayoutDemo()
    {
        setLayout(new FlowLayout());

        add(new Button("One"));
        add(new Button("Two"));
        add(new Button("Three"));
        add(new Button("Four"));
        add(new Button("Five"));

        setSize(400, 200);
        setTitle("Flow Layout Example");
        setVisible(true);
    }

    public static void main(String args[])
    {
        new FlowLayoutDemo();
    }
}
