package td1;

public class test {
	    public static void main(String[] args) {
	       
	        Dictionnaire dictionnaire = new Dictionnaire("MonDict", 10);

	        
	        Mot_dict m1 = new Mot_dict("apple", "A fruit that is sweet and crispy.");
	        Mot_dict m2 = new Mot_dict("banana", "A yellow fruit that monkeys love.");
	        Mot_dict m3 = new Mot_dict("orange", "A citrus fruit that is orange in color.");
	        Mot_dict m4 = new Mot_dict("grape", "A small, round fruit that comes in bunches.");
	        Mot_dict m5 = new Mot_dict("pear", "A sweet fruit with a narrow top and wider bottom.");

	        
	        dictionnaire.ajoutermotdict(m1);
	        dictionnaire.ajoutermotdict(m2);
	        dictionnaire.ajoutermotdict(m3);
	        dictionnaire.ajoutermotdict(m4);
	        dictionnaire.ajoutermotdict(m5);
	        
	       
	        System.out.println("Dictionnaire après ajout et tri des mots:");
	        dictionnaire.Listerdec();

	        System.out.println("------------------------------------------------");
	        String definitionRecherchee = dictionnaire.Recherche_dicho("banana");
	        System.out.println("Définition trouvée pour 'banana': " + definitionRecherchee);

	        System.out.println("------------------------------------------------");
	        dictionnaire.supprimer_mot(m3); 
	        System.out.println("\nDictionnaire après suppression de 'orange':");
	        dictionnaire.Listerdec();

	        System.out.println("------------------------------------------------");
	        String definitionAbsente = dictionnaire.Recherche_dicho("kiwi");
	        System.out.println("Définition pour 'kiwi': " + definitionAbsente);
	    }
	

}
