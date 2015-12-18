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
			char caracter;
			//mentres hi hagin caracters llegir
			while ((caracter = (char) br.read()) != -1) {
				//System.out.print(caracter);
				switch (caracter) {
					case '>':
						cases.add(x+","+y);
						x++;
						break;
					case '<':
						cases.add(x+","+y);
						x--;
						break;
					case '^':
						cases.add(x+","+y);
						y++;
						break;
					case 'v':
						cases.add(x+","+y);
						y--;
						break;
	
					default:
						break;
				}
			}
			System.out.print("Se han visitat: "+cases.size()+"cases.");
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
