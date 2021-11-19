package lab6p2_emiliocantarero_12111141;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;


public class Usuario {
    private String nombre, apellido, n_Usuario, contraseña;
    private Date fecha_nacimiento;
    private Color color_fav;
    ArrayList<Pokedex> listaP=new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String n_Usuario, String contraseña, Date fecha_nacimiento, Color color_fav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_Usuario = n_Usuario;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color_fav = color_fav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getN_Usuario() {
        return n_Usuario;
    }

    public void setN_Usuario(String n_Usuario) {
        this.n_Usuario = n_Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Color getColor_fav() {
        return color_fav;
    }

    public void setColor_fav(Color color_fav) {
        this.color_fav = color_fav;
    }

    public ArrayList<Pokedex> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Pokedex> listaP) {
        this.listaP = listaP;
    }
    
    
}
