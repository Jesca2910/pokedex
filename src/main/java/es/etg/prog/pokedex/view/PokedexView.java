package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    private Scanner sc;

    public void mostrarMenu() {
        System.out.println("Salir");
    }

    public String leerString() {
        return sc.nextLine();
    }

    public int leerEntero() {
        return sc.nextInt();
    }
}
