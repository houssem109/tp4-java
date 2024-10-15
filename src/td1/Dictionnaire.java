package td1;

public class Dictionnaire {
	public  int nb_mot;
	public Mot_dict [] dict;
	public  int taill;
	private String nom;
	
	public Dictionnaire(String nom , int taill) {
		this.dict= new Mot_dict[taill];
		this.nb_mot= 0;
		this.nom=nom;
	}
	public Dictionnaire( int taill) {
		this.dict= new Mot_dict[taill];
		this.nb_mot= 0;
		this.nom="dictionnaire";
	}
	public void ajoutermotdict(Mot_dict motdic) {
		if (nb_mot<dict.length){
		dict[nb_mot]=motdic;
		nb_mot++;
		trier();
		}
		else {
			System.out.println("tu depasser le limite");
		}
	}
	public void trier() {
		boolean test=true;
		while (test==true) {
			test=false;
			for (int i = 0 ; i<nb_mot-1;i++) {
				if (dict[i].getmot().compareTo(dict[i+1].getmot())>0) {
					Mot_dict aux = dict[i];
					dict[i]=dict[i+1];
					dict[i+1]=aux;
					test= true;
				}
			}
		}
	}
	void supprimer_mot(Mot_dict motdic) {
		boolean test=false;
		int i=0;
		while (test==false && i<nb_mot-1 ) {
			if (dict[i].getmot().compareTo(motdic.getmot())==0) {
				test=true;
		}
			else {
				i++;
			}
	}
		if (test==true) {
			for (int j=i; j<nb_mot-1;j++) {
				dict[j]=dict[j+1];
			}
			dict[nb_mot - 1] = null;
			nb_mot--;
		}
		else {
			System.out.println("dict est trie");
		}
	}
	public String Recherche_dicho(String mot) {
	    int d = 0;
	    int r = nb_mot - 1;;
	    mot = mot.toLowerCase(); 

	    while (r <= d) {
	        int m = (r + d) / 2;
	        String motm = dict[m].getmot().toLowerCase();

	        if (motm.equals(mot)==true) {
	            return dict[m].getdefinition();
	        } else if (motm.compareTo(mot) < 0) { 
	            d = m + 1; 
	        } else {
	            r = m - 1; 
	        }
	    }

	    return "Mot n'existe pas"; 
	}
	public void Listerdec() {
        for (int i = 0; i < nb_mot; i++) {
            System.out.println("Mot: " + dict[i].getmot() + " - Définition: " + dict[i].getdefinition());
        }
    }
	public int Nombre_synonyme(Mot_dict motDict) {
        int nb = 0;
        for (int i = 0; i < nb_mot; i++) {
            if (dict[i].synonyme(motDict.getmot())) {
                nb++;
            }
        }
        return nb;
    }
	
}
