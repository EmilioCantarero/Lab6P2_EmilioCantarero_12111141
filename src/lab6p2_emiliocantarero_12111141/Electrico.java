package lab6p2_emiliocantarero_12111141;


public class Electrico extends Pokemon{

    public Electrico() {
        super();
    }

    public Electrico(String nombre, String velocidad, float daño, float vida) {
        super(nombre, velocidad, daño, vida);
    }

    @Override
    public float dañoProm() {
        return 0;
    }

    @Override
    public String tipo() {
        return "Electrico";
    }
    
    
}
