import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Draw extends JPanel implements Runnable { // Runnable is to help with multithreading

    public Draw() {
        Thread thread = new Thread();
        thread.start();   
    }

    @Override
    public void run() {
        while (true){
            repaint();
        }
    }


    public void paintComponent(Graphics g2) {
        super.paintComponent(g2);
        Graphics2D g = (Graphics2D) g2;
        g.drawRect(200, 200, 400, 400);

    }
}
