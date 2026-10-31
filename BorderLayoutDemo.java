import java.awt.*;

public class BorderLayoutDemo extends Frame
{
    BorderLayoutDemo()
    {
        setLayout(new BorderLayout());

        // Add components to different regions
        add(new Button("Header"), BorderLayout.NORTH);
        add(new Button("Footer"), BorderLayout.SOUTH);
        add(new Button("Menu"), BorderLayout.WEST);
        add(new Button("Right Panel"), BorderLayout.EAST);
        add(new Button("Content Area"), BorderLayout.CENTER);

        setTitle("Border Layout Example");
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new BorderLayoutDemo();
    }
}
