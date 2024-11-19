package enter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x=(int)screenSize.getWidth()/2-frame.getWidth()/2;
        int y=(int)screenSize.getHeight()/2-frame.getHeight()/2;
        frame.setLocation(x, y);
        frame.setCursor(new Cursor(Cursor.HAND_CURSOR));


        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
