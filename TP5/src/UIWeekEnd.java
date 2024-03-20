
    
class AppWeekEnd {

    WeekEnd we;
    boolean quitter;

    AppWeekEnd(WeekEnd we) {
	this.we = we;
	this.we.mock_initialize();
	this.quitter = false;
    }
	
    public void run() {
	bienvenue();
	boolean continuer = true;
	while(!quitter) {
	    menu();
	}
	au_revoir();
    }

    public void menu() {
	boolean commande_faite = false;
	while(!commande_faite) {
		System.out.println("╭─────────────────────────────────────╮");
	    System.out.println("│ Que voulez vous faire?              │");
		System.out.println("│─────────────────────────────────────│");
	    System.out.println("│ Q: quitter                          │");
		System.out.println("│ P: gens week-end                    │");
		System.out.println("│ D: dépense week-end                 │");
		System.out.println("│ T: total dépense week-end           │");
		System.out.println("│ M: dépense moyenne par gens         │");
		System.out.println("╰─────────────────────────────────────╯");
	    String commande_brute = System.console().readLine();
	    String commande = commande_brute.strip().toLowerCase();
	    if(commande.equals("q")) {
		quitter = true;
		commande_faite = true;
	    } 
		else if(commande.equals("p")){
			System.out.println(we.getAmis());
            commande_faite = true;
		}
		else if(commande.equals("d")){
			System.out.println(we.getDepenses());
            commande_faite = true;
		}
		else if(commande.equals("t")){
			System.out.println(we.totalDepenses());
            commande_faite = true;
		}
		else if(commande.equals("m")){
			System.out.println("╭──────────────────────────────────────────────────╮");
	    	System.out.println("│ A qui voulait vous voir la dépense moyenne ?     │");
			System.out.println("│──────────────────────────────────────────────────│");
	    	System.out.println("│ A:" + we.getAmis().get(0) +"                                 │");
			System.out.println("│ P:" + we.getAmis().get(1) +"                                   │");
			System.out.println("│ D:" + we.getAmis().get(2) +"                                  │");
			System.out.println("│ T:" + we.getAmis().get(3) +"                                    │");
			System.out.println("╰──────────────────────────────────────────────────╯");
			String commande_brute2 = System.console().readLine();
	    	String commande2 = commande_brute2.strip().toLowerCase();
			if(commande2.equals("a")){
				System.out.println(we.);
				commande_faite = true;
			}
		}
		else {
		System.out.println("Commande '" + commande_brute + "' invalide.");
	    }
	}
    }

    /// Affiche un message de bienvenue
    public void bienvenue() {
	System.out.println("╭────────────────────────────────────────────────────────────────────────────────────╮");
	System.out.println("│ Bienvenue! En week-end comme dans la semaine, les bons comptes font les bons amis. │");
	System.out.println("╰────────────────────────────────────────────────────────────────────────────────────╯");
    }

    /// Affiche un message d'au revoir
    public void au_revoir() {
	System.out.println("╭──────────────────────────────────────────╮");
	System.out.println("│ Au revoir mon quoikoubaka à la cerise !! │");
	System.out.println("╰──────────────────────────────────────────╯");
    }

}

class UIWeekEnd {    
    public static void main(String[] args) {
	WeekEnd leWeekEnd = new WeekEnd();
	// Personne pierre = new Personne("Durand","Pierre"); 
	// System.out.println(pierre.getNom()); 
	// Personne paul = new Personne("Dupond","Paul"); 
	// Personne marie = new Personne("Dumond","Marie");
	// Personne anne = new Personne("Dunon","Anne");  
	// Depense d1 = new Depense(pierre, 12, "pain"); 	
	// Depense d2 = new Depense(paul, 100, "pizza"); 
	// Depense d3 = new Depense(pierre, 70, "essence");
	// Depense d4 = new Depense(marie, 15, "vin");  
	// Depense d5 = new Depense(paul, 10, "vin"); 
	// WeekEnd we = new WeekEnd();  
	// we.ajouterPersonne(pierre); 
	// we.ajouterPersonne(paul);
	// we.ajouterPersonne(marie);
	// we.ajouterPersonne(anne); 
	// we.ajouterDepense(d1);   
	// we.ajouterDepense(d2); 
	// we.ajouterDepense(d4);   
	// we.ajouterDepense(d3);
	// we.ajouterDepense(d5);
	// System.out.println("total des dépenses "+we.totalDepenses()) ;
	// System.out.println("moyenne des dépenses "+we.depensesMoyenne()) ;
	// System.out.println("total des dépenses de Pierre "+ we.totalDepensesPersonne(pierre)) ;
	// System.out.println("total des dépenses de Paul "+ we.totalDepensesPersonne(paul)) ;
	// System.out.println("total des dépenses de Marie "+ we.totalDepensesPersonne(marie)) ;
	// System.out.println("total des dépenses de Anne "+ we.totalDepensesPersonne(anne)) ;
	// System.out.println("depenses vin "+we.depenseProduit("vin"));
	// System.out.println("avoir de pierre "+we.avoirPersonne(pierre));
	// System.out.println("avoir de paul "+we.avoirPersonne(paul));	
	// System.out.println("avoir de marie "+we.avoirPersonne(marie));
	AppWeekEnd app = new AppWeekEnd(leWeekEnd);
	app.run();
    }
}
