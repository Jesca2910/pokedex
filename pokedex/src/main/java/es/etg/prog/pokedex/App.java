package es.etg.prog.pokedex;

import es.etg.prog.pokedex.controller.PokedexController;
import es.etg.prog.pokedex.view.PokedexView;

public class App {
    public static void main(String[] args) {
        PokedexView vw;
        PokedexController pk= new PokedexController();

        pk.init();
    }
}
