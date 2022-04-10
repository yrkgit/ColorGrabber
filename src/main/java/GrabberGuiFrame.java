import javax.swing.*;
import java.awt.*;

public class GrabberGuiFrame extends JFrame {
    public GrabberGuiFrame(){
        super("Color Grabber");
        add(new GrabberGuiPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GrabberGuiFrame();
            }
        });
    }
}
