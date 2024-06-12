import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Circulo implements Runnable {
    
    private int x;
    private int y;
    private int radio;
    private Color color;
    private int paso;
    private JPanel panel;
    private boolean en_ejecucion;

    public Circulo(int x, int y, int radio, Color color, JPanel panel) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.color = color;
        this.panel = panel;
        this.paso = 1;
        this.en_ejecucion = true;
    }

    public void parar() {
        this.en_ejecucion = false;
    }

    public void mover() {
        if (this.x <= this.panel.getWidth()) {
            Random random = new Random();
            this.x += random.nextInt(5);
        } 
    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.radio*2, this.radio*2);
    }

    @Override
    public void run() {
        while (this.en_ejecucion) {
            mover();
            this.panel.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}