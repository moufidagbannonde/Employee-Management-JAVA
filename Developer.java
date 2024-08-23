import java.util.List;

public class Developer extends Employee{
    String language;

    public static void main(String[] args) {
        
    }

    public Developer(long id, String Nom ,String Poste, int Salaire, String Language) {
        super(id, Nom, Poste, Salaire);
        this.language = Language;
    }

    @Override
    public String showEmploye() {
        return " Developer Employee : { id = " + getID() + " Nom " + getNom() + " Poste : " + getPoste() + " Salaire : " + getSalaire() + " language='" + getLanguage() + "'" +
            "}";
    }
    
    public  String getLanguage() {
        return this.language;
    }

    public  void setLanguage(String language) {
        this.language = language;
    }
}
