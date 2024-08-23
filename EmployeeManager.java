import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeOperations {

    List<Employee> items = new ArrayList<Employee>();
    // fonction d'ajout d'un employé 
    public void addEmployes(Employee elem){
        items.add(elem);
        menu();
    };

@Override
    public static void menu(){
        System.out.println("------------------------Menu-------------------------");
    System.out.println("Veuillez choisir une option");
    System.out.println("1.  Ajouter un employé");
    System.out.println("2.  Modifier un employé");
    System.out.println("3.  Supprimer tous les  employés");
    System.out.println("4.  Supprimer un  employé ");
    System.out.println("5. Voir la liste des employés");
    System.out.println("6. Quitter ");
    System.out.println("Entrez le choix");
    }

@Override
    public  void showAllEmployes(){
       if(items.size() != 0) {
            System.out.println("----------------------------Employés----------------------------");
        for(Employee emp : items){
            System.out.println( emp.showEmploye() );
        }
    }else {
        System.out.println(" Aucun employé trouvé ! Veuillez ajouter si vous en voulez");
    }
    menu();
    }
   // fonction de suppression d'un employé
@Override
public void removeEmployes(int position) {
    items.removeIf(e->e.ID == position);
    System.out.println("Employé supprimé avec succès !");
    if(items.size() != 0) {
        System.out.println(items.toString());
    } else {
        System.out.println("Plus d'employés dans la liste !");
    }
    menu();
    }

@Override
    // fonction d'obtention d'un employé spécifique grâce à son id
    public void  getEmploye(int id) {
     for(Employee emp : items){
        if(emp.getID() == id){
            System.out.println( "L'utilisateur ayant l'id " + id + " est le suivant " + emp.showEmploye());
           ;
        } else {
            System.out.println(" Aucun employé de cet ID n'a été trouvé ! ");
                }
     }
     
}

@Override
//  fonction de récupération de la taille du tableau 
public int getEmployesCount() {
    return items.size();
}

@Override
// fonction de suppression de tous les employés 
public void removeAllEmployes(){
    items.clear();
    System.out.println("Tous les employés ont été supprimés avec succès ! ");
}
// public void showEmployeById(int id){
//     for(Employee e: items){
//         if(e.getID() == id){
//             e.showEmploye();
//         }else {
//             System.out.println(" Aucun employé de cet ID n'a été trouvé ! ");
//         }
//     }
// }
@Override
public void updateEmploye(int e){
    Scanner scanner = new Scanner(System.in);
    for(Employee el : items){
        if(el.ID == e){
            System.out.println("NB : Poste non modifiable ");
            System.out.println("Entrez le nouvel ID");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Entrez le nouveau nom");
            String nom = scanner.nextLine();
            System.out.println("Entrez le nouveau salaire");
            int salaire = scanner.nextInt();
            scanner.close();

            el.setID(id);
            el.setNom(nom);
            el.setPoste(poste);
            el.setSalaire(salaire);
        }
    }
}

}