
import java.util.Scanner;

public class StartApp {	
	Scanner sc = new Scanner(System.in);
	public void creerNoeud() {
	
			  }		 
	
	public void addPyloneConnect() {
		System.out.println("Veuillez saisir l'ID du noeud auquel ajouter :");
		System.out.println("Veuillez saisir l'ID du pylone :");
		String idNoeud = sc.nextLine();
		String idPylone = sc.nextLine();
		System.out.println("Le pylone " + pylone + " est d�sormais connect� � ce noeud.");
	}	
	
	public static void main (String args[]){		 
		
		System.out.println("Que voulez-vous faire ?");
		System.out.println("1. Cr�er un noeud");
		System.out.println("2. Ajouter un pylone � un Noeud");
			
			int choix = sc.nextInt();
			if(choix ==1){ //cr�ation d'un Noeud
				creerNoeud()
				}			 
			if(choix ==2){ //ajout d'un pylone au Noeud
				
				}
					
	
		
	 }
}
