import java.awt.*;

public class ColorAnalyzer {
    private Color color;
    private Robot robot;

    public String GrabbedColor(int x,int y)  {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        color= robot.getPixelColor(x,y);
        return color.toString();
    }
}
