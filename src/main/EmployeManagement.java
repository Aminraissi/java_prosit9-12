package main;

import entities.AffectationHashMap;
import entities.Departement;
import entities.Employe;

import java.util.SortedMap;

public class EmployeManagement {

    public static void main(String[] args) {
        AffectationHashMap AHM = new AffectationHashMap();

        Employe e1 = new Employe(1, "amine");
        Employe e2 = new Employe(2, "jasser");
        Employe e3 = new Employe(3, "mouadh");

        Departement d1 = new Departement(101, "RH");
        Departement d2 = new Departement(102, "IT");

        AHM.ajouterEmployeDepartement(e1, d1);
        AHM.ajouterEmployeDepartement(e2, d2);
        AHM.ajouterEmployeDepartement(e3, d1);

        AHM.afficherEmployesEtDepartements();

        AHM.supprimerEmploye(e2);
        AHM.afficherEmployesEtDepartements();

        System.out.println("Employé e1 trouvé : " + AHM.rechercherEmploye(e1));

        SortedMap<Employe, Departement> trie = AHM.trierMap();
        System.out.println("Collection triée : " + trie);
    }
}