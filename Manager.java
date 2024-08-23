import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;


public class Manager extends Employee{
    int inferior;
    public static void main(String[] args) {
        
    }
    public Manager(long id, String Nom ,String Poste, int Salaire, int Inferior){
        super(id, Nom, Poste, Salaire);
        this.inferior = Inferior;
    }
    @Override
    public String showEmploye() {
        return "Manager Employee : { id :" + getID()  +
            " , Nom : " + getNom() + " , Poste : " + getPoste() + ", Salaire " + getSalaire() + "inferior = " + getInferior() + " " +
            "}";
    }

    public int getInferior() {
        return this.inferior;
    }

    public  void setInferior(int inferior) {
        this.inferior = inferior;
    }

}