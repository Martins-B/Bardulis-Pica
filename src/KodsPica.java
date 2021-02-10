import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class KodsPica {
	static String failaNosaukums;

	public static void ierakstit(String vards,String adrese,String telefons,String piegade,String picasIzvele,int izmers,String piedevas,double summa) {
		try {
		failaNosaukums=vards+" pas�t�jums";
		FileWriter fw = new FileWriter(failaNosaukums);
		PrintWriter raksta = new PrintWriter(fw);
		raksta.println("Pas�t�t�ja v�rds = "+vards);
		raksta.println("Pas�t�t�ja adrese = "+adrese);
		raksta.println("Pas�t�t�ja telefona nummurs = "+telefons);
		raksta.println("Pas�t�t�js sa�ems savu pasut�jumu: "+piegade);
		raksta.println("Pas�t�jums = "+picasIzvele+" "+izmers+" cm ar "+piedevas);
		raksta.println("Pas�t�juma apmaksas summa = "+summa);
		raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "K��me ierakstot fail�!", "K��me!", JOptionPane.ERROR_MESSAGE);	

		}
	}
	
	public static double summa (String piegade,String picasIzvele,int izmers,String piedevas) {
		 double summa=0;
		 
		 switch(picasIzvele) {
		 case "margarita":summa=summa+4; break;
		 case "mocarella":summa=summa+4; break;
		 case "salami":summa=summa+4.5; break;
		 case "havaju":summa=summa+6.5; break;
		 case "garnelu":summa=summa+7; break;
		 case "bekona":summa=summa+5; break;
		 default: JOptionPane.showMessageDialog(null, "��da darb�ba nepast�v!", "K��me!", JOptionPane.ERROR_MESSAGE); break;
		 }
		 
		 switch(izmers) {
		 case 20:summa=summa*1; break;
		 case 30:summa=summa*1.5; break;
		 case 50:summa=summa*2.5; break;
		 default: JOptionPane.showMessageDialog(null, "��da darb�ba nepast�v!", "K��me!", JOptionPane.ERROR_MESSAGE); break;
		 }
		 
		 switch(piedevas) {
		 case "skinkis":summa=summa+1.5; break;
		 case "salami":summa=summa+1; break;
		 case "gurkisi":summa=summa+1.2; break;
		 case "anannas":summa=summa+2; break;
		 case "senes":summa=summa+2.5; break;
		 case "siers":summa=summa+1.7; break;
		 case "neviena":summa=summa+0; break;
		 default: JOptionPane.showMessageDialog(null, "��da darb�ba nepast�v!", "K��me!", JOptionPane.ERROR_MESSAGE); break;
		 }
		 
		 switch(piegade) {
		 case "piegade": summa=summa+3.5; break;
		 case "uz vietas": summa=summa+0; break;
		 default: JOptionPane.showMessageDialog(null, "��da darb�ba nepast�v!", "K��me!", JOptionPane.ERROR_MESSAGE); break;

		 }
		 
		return summa;		
	}	


	public static void main(String[] args) {
		 
		JOptionPane.showMessageDialog(null, "Sveicin�ti pic�rij�!");
		
		String picasIzvele;
		String piedevas;
		int izmers;
		
		do {
			picasIzvele=(JOptionPane.showInputDialog("Picu izv�le: Margarita 4 EUR; Mocarella 4 EUR; Salami 4.50 EUR; Havaju 6.5 EUR; Garnelu 7 EUR; Bekona 5EUR; |  Izv�lieties un ievadiet savu izv�l�to picu: "));
	picasIzvele=picasIzvele.toLowerCase();
		}while(!picasIzvele.matches("margarita|mocarella|salami|havaju|garnelu|bekona"));
		
		do {
			izmers=Integer.parseInt(JOptionPane.showInputDialog("Picu izm�ri: 20 cm (pamata cena); 30 cm (pamata cena * 1.5); 50 cm (pamata cena*2.5); | Izv�lieties un ievadiet savu izv�l�to picas izm�ru (tikai skaitli):"));
		}while(izmers!=20 && izmers!=30 && izmers!=50);
		
		do {
			piedevas=(JOptionPane.showInputDialog("Piedevu izv�le: Skinkis 1.5 EUR; Salami 1 EUR; Gurkisi 1.2 EUR; Ananass 2 EUR; Senes 2.50 EUR; Siers 1.70 EUR; Neviena | Izv�lieties un ievadiet savu izv�l�to piedevu:"));
		piedevas=piedevas.toLowerCase();	
		}while(!piedevas.matches("skinkis|salami|gurkisi|ananass|senes|siers|neviena"));
		
		String vards;
		String adrese;
		String telefons;
		String piegade;
			
		vards=(JOptionPane.showInputDialog("Ievadiet savu v�rdu:"));
		adrese=(JOptionPane.showInputDialog("Ievadiet savu adresi:"));
		telefons=(JOptionPane.showInputDialog("Ievadiet savu telefona nummuru:"));
		do {
		piegade=(JOptionPane.showInputDialog("Ja v�laties sa�emt pas�t�jumu ar pieg�di 3.50 EUR - piegade | Ja v�laties sa�emt uz vietas 0 EUR - uz vietas"));
		piegade=piegade.toLowerCase();
		}while(!piegade.matches("piegade|uz vietas"));
		
		double summa=summa(piegade,picasIzvele,izmers, piedevas);

		ierakstit(vards,adrese,telefons,piegade,picasIzvele,izmers,piedevas,summa);

}
}