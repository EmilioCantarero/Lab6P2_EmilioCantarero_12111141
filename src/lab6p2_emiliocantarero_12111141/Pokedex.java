package lab6p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class Pokedex {
    ArrayList<Pokemon> lista= new ArrayList();

    public Pokedex() {
    }

    public ArrayList<Pokemon> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pokemon> lista) {
        this.lista = lista;
    }
    
}
