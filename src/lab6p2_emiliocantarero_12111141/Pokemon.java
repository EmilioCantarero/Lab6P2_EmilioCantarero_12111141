package lab6p2_emiliocantarero_12111141;


public class Pokemon {
    private String nombre, velocidad;
    private float daño, vida;

    public Pokemon() {
    }

    public Pokemon(String nombre, String velocidad, float daño, float vida) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.daño = daño;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }
    
    
}
