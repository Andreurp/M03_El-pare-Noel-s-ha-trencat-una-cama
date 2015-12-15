package net.andreu.cama2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * El pare Noel s'ha trencat una cama
 *
 */
public class App {

	private static String arxiu = "src/main/resources/visites.txt";

	public static void main(String[] args) {
		llegirFitxer();
	}

	public static String llegirFitxer() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(arxiu));
			// String linia = br.readLine();
			char caracter;
			while ((caracter = (char) br.read()) != -1) {
				// System.out.print(caracter);
				switch (caracter) {
				case '<':
					
					break;
				case '>':

					break;
				case 'v':

					break;
				case '^':

					break;

				default:
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return "";
	}
}
