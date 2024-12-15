package main;

import entities.Departement;
import entities.DepartementHashSet;

public class DepartementManagement {

    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "IJK", 20);
        Departement d2 = new Departement(2, "M", 15);
        Departement d3 = new Departement(3, "A", 10);


        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);


        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();


        System.out.println("Rechercher par nom (IJK) : " + gestionDepartements.rechercherDepartement("IJK"));
        System.out.println("Rechercher par objet (d2) : " + gestionDepartements.rechercherDepartement(d2));

        gestionDepartements.supprimerDepartement(d1);


        System.out.println("Liste après suppression :");
        gestionDepartements.displayDepartement();


        System.out.println("Départements triés par ID :");
        for (Departement d : gestionDepartements.trierDepartementById()) {
            System.out.println(d);
        }
    }
}