package edu.pucp.perugo.data.entities;

public class Evento {
    private int idEvento;
    private String titulo;
    private String descripcion;
    private String fechaIni;
    private String fechaFin;
    private Ubicacion ubicacion;
    private Persona registrador;
    private NaturalezaEvento naturaleza;
    private int contVisitas;

    public NaturalezaEvento getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(NaturalezaEvento naturaleza) {
        this.naturaleza = naturaleza;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Persona getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Persona registrador) {
        this.registrador = registrador;
    }

    public int getContVisitas() {
        return contVisitas;
    }

    public void setContVisitas(int contVisitas) {
        this.contVisitas = contVisitas;
    }
}
