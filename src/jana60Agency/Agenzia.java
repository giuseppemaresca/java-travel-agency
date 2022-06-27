package jana60Agency;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Agenzia {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	
  System.out.println("Inserisci la destinazione");
  String destinazione= scan.nextLine();
  System.out.println("Inserisci il giorno");
 int giorno= Integer.parseInt(scan.nextLine());
 
  System.out.println("Inserisci il mese ");
 int mese= Integer.parseInt(scan.nextLine());
 System.out.println("Inserisci l'anno");
int anno= Integer.parseInt(scan.nextLine());

LocalDate dataInizio=LocalDate.of(giorno, mese, anno);
System.out.println(dataInizio);

System.out.println("Inserisci il giorno");
int giornof= Integer.parseInt(scan.nextLine());

System.out.println("Inserisci il mese ");
int mesef= Integer.parseInt(scan.nextLine());
System.out.println("Inserisci l'anno");
int annof= Integer.parseInt(scan.nextLine());

LocalDate dataFine=LocalDate.of(giorno, mese, anno);
System.out.println(dataFine);


 

  
  
}
}