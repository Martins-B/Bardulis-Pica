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
		failaNosaukums=vards+" pas�t�jums";
		FileWriter fw = new FileWriter(failaNosaukums);
		PrintWriter raksta = new PrintWriter(fw);
		raksta.println("Pas�t�t�ja v�rds = "+vards);
		raksta.println("Pas�t�t�ja adrese = "+adrese);
		raksta.println("Pas�t�t�ja telefona nummurs = "+telefons);
		raksta.println("Pas�t�t�js sa�ems savu pasut�jumu: "+piegade);
		raksta.println("Pas�t�jums = "+picasIzvele+" "+izmers+" cm ar "+piedevas);

		raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "K��me ierakstot fail�!", "K��me!", JOptionPane.ERROR_MESSAGE);	

		}
	}
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Sveicin�ti pic�rij�!");
		
		double summa=0;
		String picasIzvele;
		String piedevas;
		int izmers;
		
		do {
			picasIzvele=(JOptionPane.showInputDialog("Picu izv�le: Margarita; Mocarella; Salami; Havaju; Garnelu; Bekona; |  Izv�lieties un ievadiet savu izv�l�to picu: "));
	picasIzvele=picasIzvele.toLowerCase();
		}while(!picasIzvele.matches("margarita|mocarella|salami|havaju|garnelu|bekona"));
		
		do {
			izmers=Integer.parseInt(JOptionPane.showInputDialog("Picu izm�ri: 25 cm; 30 cm; 50 cm; | Izv�lieties un ievadiet savu izv�l�to picas izm�ru (tikai skaitli):"));
		}while(izmers!=25 && izmers!=30 && izmers!=50);
		
		do {
			piedevas=(JOptionPane.showInputDialog("Piedevu izv�le: Skinkis; Salami; Gurkisi; Ananass; Senes; Siers | Izv�lieties un ievadiet savu izv�l�to piedevu:"));
		piedevas=piedevas.toLowerCase();	
		}while(!piedevas.matches("skinkis|salami|gurkisi|ananass|senes|siers"));
		
		String vards;
		String adrese;
		String telefons;
		String piegade;
	
		
		vards=(JOptionPane.showInputDialog("Ievadiet savu v�rdu:"));
		adrese=(JOptionPane.showInputDialog("Ievadiet savu adresi:"));
		telefons=(JOptionPane.showInputDialog("Ievadiet savu telefona nummuru:"));
		piegade=(JOptionPane.showInputDialog("Ja v�laties sa�emt pas�t�jumu ar pieg�di - piegade | Ja v�laties sa�emt uz vietas - uz vietas"));
		piegade=piegade.toLowerCase();
		if(piegade=="piegade") {
			summa=summa+3.5;
		}else if(piegade=="uz vietas") {
			summa=summa+0;
		}
ierakstit(vards,adrese,telefons,piegade,picasIzvele,izmers,piedevas);



}
}