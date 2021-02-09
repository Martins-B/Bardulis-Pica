import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class KodsPica {

	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Sveicinâti picçrijâ!");
		
		String picasIzvele;
		String piedevas;
		int izmers;
		
		do {
			picasIzvele=(JOptionPane.showInputDialog("Picu izvçle: Margarita; Mocarella; Salami; Havaju; Garnelu; Bekona; |  Izvçlieties un ievadiet savu izvçlçto picu: "));
	picasIzvele=picasIzvele.toLowerCase();
		}while(!picasIzvele.matches("margarita|mocarella|salami|havaju|garnelu|bekona"));
		
		do {
			izmers=Integer.parseInt(JOptionPane.showInputDialog("Picu izmçri: 25 cm; 30 cm; 50 cm; | Izvçlieties un ievadiet savu izvçlçto picas izmçru (tikai skaitli):"));
		}while(izmers!=25 && izmers!=30 && izmers!=50);
		
		do {
			piedevas=(JOptionPane.showInputDialog("Piedevu izvçle: Skinkis; Salami; Gurkisi; Ananass; Senes; Siers | Izvçlieties un ievadiet savu izvçlçto piedevu:"));
		piedevas=piedevas.toLowerCase();	
		}while(!piedevas.matches("skinkis|salami|gurkisi|ananass|senes|siers"));
		
		System.out.println(picasIzvele);
		System.out.println(izmers);
		System.out.println(piedevas);

}
}