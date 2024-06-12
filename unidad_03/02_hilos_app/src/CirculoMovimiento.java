import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class CirculoMovimiento extends JPanel {
    
    private Circulo circulo1;
    private Circulo circulo2;

    public CirculoMovimiento() {
        Random random = new Random();
        Color color = new Color(random.nextInt(255), 
                                random.nextInt(255), 
                                random.nextInt(255));
        this.circulo1 = new Circulo(0, 50, 20, color, this);
        color = new Color(random.nextInt(255), 
                                random.nextInt(255), 
                                random.nextInt(255));
        this.circulo2 = new Circulo(0, 100, 20, color, this);

        Thread hilo1 = new Thread( this.circulo1 );
        Thread hilo2 = new Thread( this.circulo2 );

        hilo1.start();
        hilo2.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.circulo1.dibujar(g);
        this.circulo2.dibujar(g);
    }
}
