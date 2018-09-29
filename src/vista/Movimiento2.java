package vista;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Movimiento2 extends JFrame {

	Color color;

	public Movimiento2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		color = new Color(124);
		setBackground(new Color(200, 50, 50));
		stB();
	}

	public void stB() {
		for (int i = 0; i < 255; i++) {
			for (int j = 0; j < 255; j++) {
				for (int k = 0; k < 255; k++) {
					setBackground(new Color(i, j, k));
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	// expresion polaca
	// torres

	public static void main(String... args) {
		new Movimiento2();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		// g.clearRect(x, yInicio - 1, 100, 100);
		g.fillRect(3, 50, 100, 100);
		g.fillOval(150, 50, 100, 100);
		g.fill3DRect(300, 50, 100, 150, false);
		// g.fillPolygon(new int[] { 21, 3, 4 }, new int[] { 21, 25, 14, 9 }, 14);
		g.drawRect(3, 500, 100, 100);
		g.clearRect(3, 50, 100, 100);
		g.clipRect(5, 50, 2, 500);
		g.drawLine(100, 500, 2, 344);
	}

}
