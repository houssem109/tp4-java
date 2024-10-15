package td1;

public class Mot_dict {
	private String mot ;
	private String definition ;
	
	public Mot_dict(String mot, String definition) {
        this.mot = mot;
        this.definition = definition;
    }
	public String getmot() {
		return mot;
		
	}
	public String getdefinition() {
		return definition;
	}
	public void setdefinition(String d) {
			definition = d;
	}
	public void setmot(String m) {
		mot = m ;
	}
	public boolean synonyme(String s) {
		if (this.getmot().equals(s)==true) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
