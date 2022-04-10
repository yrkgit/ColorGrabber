import javax.swing.*;
import java.awt.*;

public class GrabberGuiFrame extends JFrame {
    private static JTextField colorField = new JTextField(20);
    Font font = new Font("SansaSerif",Font.BOLD,20);
    public GrabberGuiFrame(){
        super("Color Grabber");
        GrabberGuiPanel guiPanel = new GrabberGuiPanel();

        guiPanel.add(colorField);
        colorField.setEditable(false);
        colorField.setFont(font);
        colorField.setPreferredSize(new Dimension(200,30));;

        add(guiPanel);
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
    public static void displayColor(String s){
        colorField.setText(s);
    }
}
