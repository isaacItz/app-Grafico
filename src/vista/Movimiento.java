package vista;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Movimiento extends JFrame {

	private int xInicio, yInicio, xFin, yFin;
	int rojo, verde, azul;
	private Color color;

	public static void main(String[] args) {
		new Movimiento();
	}

	public Movimiento() {

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		xInicio = 100;
		xFin = 800;
		yInicio = 200;
		yFin = 400;
		rojo = 1;
		verde = 100;
		color = new Color(rojo, verde, 50);
		moverY();
		moverX();

	}

	public void moverX() {
		for (; xInicio <= xFin; xInicio++) {
			if (verde < 255)
				verde++;
			color = new Color(rojo, verde, 50);
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	public void moverY() {
		for (; yInicio <= yFin; yInicio++) {
			rojo++;
			color = new Color(rojo, 100, 50);
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	@Override
	public void update(Graphics g) {
		g.setColor(color);
		g.clearRect(xInicio - 1, yInicio - 1, 100, 100);
		g.fillRect(xInicio-1, yInicio, 100, 99);
	}

	@Override
	public void paint(Graphics g) {
		update(g);
	}
}