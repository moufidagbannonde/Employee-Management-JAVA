// package POO-GESTION;
import java.util.List;
import java.util.ArrayList;

abstract class Employee {
    protected long ID;
    protected int salaire ;
    protected String nom, poste;

    List<Employee> items = new ArrayList<Employee>();

    public Employee (long id, String Nom ,String Poste, int Salaire){
        this.ID = id;
        this.salaire = Salaire;
        this.nom = Nom;
        this.poste = Poste;
    }
  public static void  main(String[] args) {

  }


    abstract String showEmploye();

       
public long getID(){
        return this.ID;
       }
       public void setID(long Id){
        this.ID = Id;
       }
       public String getNom(){
        return this.nom;
       }
       public void setNom(String Nom){
        this.nom = Nom;
       }
       public String getPoste(){
        return this.poste;
       }
       public void setPoste(String Poste){
        this.poste = Poste;
       }
       public double getSalaire(){
        return this.salaire;
       }
       public void setSalaire(int Salaire){
        this.salaire = Salaire;
       }
    }