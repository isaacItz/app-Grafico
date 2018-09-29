package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Tarea extends JFrame {

	public Tarea() {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Windows\\System32\\PerfCenterCpl.ico"));
		setTitle("Tarea");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		// cambiarColorFondo();
	}

	public static void main(String[] args) {

		new Tarea();

	}

	public void cambiarColorFondo() {
		for (int i = 255; i > 0; i -= 1) {
			getContentPane().setBackground(new Color(0, i, i));
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	public void pintarEstrellas(Graphics g) {
		int[] x  = {42,52,72,52,60,40,15,28,9,32,42};
		int [] y = {38,62,68,80,105,85,102,75,58,20,38};
		g.fillPolygon(x, y, 11);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.darkGray);
		super.paint(g);
		double ancho = getSize().getWidth();
		double alto = getSize().getHeight();
		int[] tamaño = { 100, 150 };
		int fila = (int) ((ancho / 100) * 50) - tamaño[0];
		int columna = (int) ((alto / 100) * 90) - tamaño[1];
		pintarEstrellas(g);
		g.fillRect(fila, columna, tamaño[0], tamaño[1]);
	}

}
