package net.andreu.cama2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * El pare Noel s'ha trencat una cama
 *
 */
public class App {
	
	 Set<String>cases = new HashSet<String>();
	private String arxiu = "src/main/resources/visites.txt";

	public static void main(String[] args) {
		App a =new App();
		a.inici();
	}
	
	public void inici(){
		llegirFitxer();
	}

	public void llegirFitxer() {
		BufferedReader br = null;
		int x=0;
		int y=0;
		try {
			br = new BufferedReader(new FileReader(arxiu));
			String linia = br.readLine();
			char caracter;
			//mentres hi hagin caracters llegir
			//while ((caracter = (char) br.read()) != '\0') {
			for (int i = 0; i < linia.length(); i++){
				//System.out.print(caracter);
				caracter = linia.charAt(i);
				switch (caracter) {
					case '>':
						x++;
						break;
					case '<':
						x--;
						break;
					case '^':
						y++;
						break;
					case 'v':
						y--;
						break;
				}
				cases.add(x+","+y);
			}
			System.out.println("Se han visitat: "+cases.size()+"cases.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
