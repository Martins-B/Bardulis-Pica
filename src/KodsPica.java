import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class KodsPica {
	static String failaNosaukums;

	public static void ierakstit(String vards,String adrese,String telefons,String piegade,String picasIzvele,int izmers,String piedevas) {
		try {
		failaNosaukums=vards+" pasûtîjums";
		FileWriter fw = new FileWriter(failaNosaukums);
		PrintWriter raksta = new PrintWriter(fw);
		raksta.println("Pasûtîtâja vârds = "+vards);
		raksta.println("Pasûtîtâja adrese = "+adrese);
		raksta.println("Pasûtîtâja telefona nummurs = "+telefons);
		raksta.println("Pasûtîtâjs saòems savu pasutîjumu: "+piegade);
		raksta.println("Pasûtîjums = "+picasIzvele+" "+izmers+" cm ar "+piedevas);

		raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Kïûme ierakstot failâ!", "Kïûme!", JOptionPane.ERROR_MESSAGE);	

		}
	}
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Sveicinâti picçrijâ!");
		
		double summa=0;
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
		
		String vards;
		String adrese;
		String telefons;
		String piegade;
	
		
		vards=(JOptionPane.showInputDialog("Ievadiet savu vârdu:"));
		adrese=(JOptionPane.showInputDialog("Ievadiet savu adresi:"));
		telefons=(JOptionPane.showInputDialog("Ievadiet savu telefona nummuru:"));
		piegade=(JOptionPane.showInputDialog("Ja vçlaties saòemt pasûtîjumu ar piegâdi - piegade | Ja vçlaties saòemt uz vietas - uz vietas"));
		piegade=piegade.toLowerCase();
		if(piegade=="piegade") {
			summa=summa+3.5;
		}else if(piegade=="uz vietas") {
			summa=summa+0;
		}
ierakstit(vards,adrese,telefons,piegade,picasIzvele,izmers,piedevas);



}
}