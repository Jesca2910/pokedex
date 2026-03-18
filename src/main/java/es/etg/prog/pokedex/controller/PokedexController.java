package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    private PokedexView vista;

    public PokedexController(PokedexView vista) {
        this.vista = vista;
    }
    
    public void init(){
        String op;
        do {
            vista.mostrarMenu();
            op=vista.leerString();
        } while (op!="salir");   
        
    }
}
