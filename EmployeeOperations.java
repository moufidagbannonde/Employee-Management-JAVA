import java.util.List;
public interface EmployeeOperations {

    // ajouter un employé
    public void addEmployes(Employee elem);
    // supprimer un employé
    public void removeEmployes(int position);
    // fonction d'obtention d'un employé spécifique grâce à son id
    public void getEmploye(int position);
    // fonction de suppression de tous les employés 
    public void removeAllEmployes();
    // récupérer tous les employés
   public void  showAllEmployes();
    // mettre à jour un employé spécifique par son ID.
    public void updateEmploye(int e);
    }
