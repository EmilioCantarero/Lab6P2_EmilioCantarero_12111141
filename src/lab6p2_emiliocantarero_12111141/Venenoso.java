package lab6p2_emiliocantarero_12111141;


public class Venenoso extends Pokemon{

    public Venenoso() {
        super();
    }

    public Venenoso(String nombre, String velocidad, float daño, float vida) {
        super(nombre, velocidad, daño, vida);
    }

    @Override
    public float dañoProm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tipo() {
        return "Venenoso";
    }
    
}
