import java.awt.*;
import java.awt.event.*;

public class MyAWTApp extends Frame 
{
    private Button button;

    public MyAWTApp() 
    {
        setTitle("AWT Example");
        setSize(300, 150);
        setLayout(new FlowLayout());
        button = new Button("Click me!");
        add(button);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new MyAWTApp();
    }
}
