package edu.pucp.perugo.data.entities;

public class NaturalezaEvento {
    private int id;
    private String nombre;/*Concierto, Festividad, Desfile, etc*/
    private String descripcion;
    private String ambito;/*privado publico*/

    public NaturalezaEvento(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
