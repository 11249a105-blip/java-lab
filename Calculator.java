import java.awt.*;

public class Calculator extends Frame
{
    Calculator()
    {
        setLayout(new BorderLayout());

        // Display area
        TextField display = new TextField();
        add(display, BorderLayout.NORTH);

        // Create GridLayout with 4 rows and 4 columns
        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4, 5, 5));

        // Calculator buttons
        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for(int i = 0; i < buttons.length; i++)
        {
            p.add(new Button(buttons[i]));
        }

        add(p, BorderLayout.CENTER);

        setTitle("Calculator");
        setSize(300, 350);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}
