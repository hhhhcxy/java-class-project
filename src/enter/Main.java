package enter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    System.out.println("jump");
                }
                if(e.getKeyCode()==KeyEvent.VK_SHIFT){
                    System.out.println("run");
                }
            }
        });
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+" "+e.getY()+" "+e.getClickCount()+" "+e.getButton());
            }
        });

        frame.setLayout(null);
        Label label=new Label("qwq");
        label.setLocation(100,100);
        label.setSize(50,100);
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        frame.add(label);
    }
}
