import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GrabberGuiPanel extends JPanel implements MouseListener {

    private static final int WINDOW_HEIGHT = 500;
    private static final int WINDOW_WIDTH = 500;

    ColorAnalyzer analyzer = new ColorAnalyzer();
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public GrabberGuiPanel() {
        addMouseListener(this);
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    }

    private int x, y;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println(x);
        System.out.println(y);
        GrabberGuiFrame.displayColor(analyzer.GrabbedColor(x,y));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
