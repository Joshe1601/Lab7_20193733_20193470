package Beans;

public class Seleccion {
    private int idSeleccion;
    private String nombre;
    private String tecnico;
    private Estadio estadio;
    private String primerPartido;

    public int getIdSeleccion() {
        return idSeleccion;
    }

    public void setIdSeleccion(int idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getPrimerPartido() {
        return primerPartido;
    }

    public void setPrimerPartido(String primerPartido) {
        this.primerPartido = primerPartido;
    }
}
