package lab6p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class Pokedex {
    ArrayList<Pokemon> lista= new ArrayList();
    private float daño_promedio; 
    
    public Pokedex() {
    }

    public ArrayList<Pokemon> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pokemon> lista) {
        this.lista = lista;
    }

    public float getDaño_promedio() {
        return daño_promedio;
    }

    public void setDaño_promedio(float daño_promedio) {
        this.daño_promedio = daño();
    }
    
    public float daño(){
        float d=0;
        for (Pokemon p : lista) {
            d+=p.getDaño();
        }
        return d/lista.size();
    }
    
}
