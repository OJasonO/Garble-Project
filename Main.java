import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Container;
import java.awt.BorderLayout;

public class Main  extends JFrame{
    private static Main window;
    private static Draw draw;

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public Main() {
        draw = new Draw();
    }

    public static void main(String[] args) throws Exception {
        window = new Main();
        Container ctn = window.getContentPane();
        ctn.setLayout(new BorderLayout());
        ctn.add(Main.draw, BorderLayout.CENTER);

        window.pack();
        window.setSize(WIDTH, HEIGHT);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);

        window.setTitle("Garble");
        window.setVisible(true);
    }
}
