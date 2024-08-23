import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        EmployeeManager manage = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choix;
    do { 
        System.out.println("------------------------Menu-------------------------");
    System.out.println("Veuillez choisir une option");
    System.out.println("1.  Ajouter un employé");
    System.out.println("2.  Modifier un employé");
    System.out.println("3.  Supprimer tous les  employés");
    System.out.println("4.  Supprimer un  employé ");
    System.out.println("5. Voir la liste des employés");
    System.out.println("6. Voir un employé ");
    System.out.println("7. Quitter ");
    System.out.println("Entrez le choix");
    
     choix = scanner.nextInt();

    switch(choix){
    case 1:
        System.out.println("Id de l'employé ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nom de l'employé ");
        String nom = scanner.nextLine();
        System.out.println("Poste de l'employé (Manager ou Developper )");
        String poste = scanner.nextLine();
        System.out.println("Salaire de l'employé ");
        int salaire = scanner.nextInt();   

        if(poste.equals("Manager")){
            scanner.nextLine();
            System.out.println("Entrez le nombre de personnes sous sa responsabilité");
            int inferior = scanner.nextInt();
            manage.addEmployes(new Manager(id, nom, poste, salaire, inferior));
        } else if (poste.equals("Developper")){
            scanner.nextLine();
            System.out.println(" Entrez le language du dévéloppeur ");
            String language = scanner.nextLine();
            manage.addEmployes(new Developer(id, nom, poste, salaire, language));
        } else {
            System.out.println(" Désolé , vous ne pouvez pas enregistrer un employé de ce poste ! ");
        };
        break;
case 2:
    System.out.println("Entrez l'id de l'employé à modifier ");
        int a = scanner.nextInt();
        manage.updateEmploye(a);
        break;
case 3 :
        
        manage.removeAllEmployes();
        break;
case 4:
       System.out.println(" Entrez l'id de l'élément à supprimer");
       int iD = scanner.nextInt();
       manage.removeEmployes(iD);
       break;
case 5:
        manage.showAllEmployes();
       break;
case 6:
       System.out.println("Entrez l'ID de l'employé à supprimer ! ");
       int element = scanner.nextInt();
       manage.getEmploye(element);
       break;
case 7:
       System.out.println(" Merci de votre amabilité ! En espérant vous revoir très bientôt ");
       break;
default :
       System.out.println( " Merci d'entrer un choix valide ");
       break;
    }} 
    while (choix != 7);
    }
}