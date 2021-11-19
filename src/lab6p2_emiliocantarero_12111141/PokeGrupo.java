package lab6p2_emiliocantarero_12111141;

import java.util.ArrayList;
import java.util.Date;


public class PokeGrupo {
    private String nombre;
    ArrayList<Usuario> miembros = new ArrayList();
    private Date fecha_creacion;
    private Usuario lider;
    private String tipo;

    public PokeGrupo() {
    }

    public PokeGrupo(String nombre, Date fecha_creacion, Usuario lider, String tipo) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
