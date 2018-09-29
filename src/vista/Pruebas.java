package vista;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {

		JComboBox<Integer> caja = new JComboBox<>();
		caja.addItem(4);
		caja.addItem(4);
		caja.addItem(4);
		caja.addItem(4);

		String[] orden = { "fda", "fasd" };

		JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog(caja, "seleccion", "jeje",
				JOptionPane.INFORMATION_MESSAGE, null, orden, "fda"));
		int[] ar = new int[50000];

		for (int i = 0; i < ar.length; i++)
			ar[i] = (ar.length) - i;

		System.out.println("--------");
		try (Scanner dx = new Scanner(System.in)) {
			dx.nextLine();
		}

		double tiempoII = System.currentTimeMillis();
		insercionDirecta2(ar);
		double result = System.currentTimeMillis() - tiempoII;
		System.out.println("resultado de inserccion: " + result);

		for (int i = 0; i < ar.length; i++)
			ar[i] = (ar.length) - i;

		tiempoII = System.currentTimeMillis();
		burbuja(ar);
		result = System.currentTimeMillis() - tiempoII;
		System.out.println("resultado de burbuja: " + result);

		for (int i = 0; i < ar.length; i++)
			ar[i] = (ar.length) - i;

		tiempoII = System.currentTimeMillis();
		Arrays.sort(ar);
		result = System.currentTimeMillis() - tiempoII;
		System.out.println("resultado de Arrays.sort: " + result);

//		for (int i : ar) {
//			System.out.println(i);
//		}

	}

	static public void burbuja(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void insercionDirecta(int A[]){
	    int p, j;
	    int aux;
	    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
	              aux = A[p]; // el final, guardamos el elemento y
	              j = p - 1; // empezamos a comprobar con el anterior
	              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
	                                                                    // valor de aux sea menor que los
	                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
	                             j--;                   // la derecha
	              }
	              A[j + 1] = aux; // colocamos aux en su sitio
	    }
	}
	
	static public void insercionDirecta2(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j -= 1;
			}
		}
	}

}

