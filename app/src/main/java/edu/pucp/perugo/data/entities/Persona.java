package edu.pucp.perugo.data.entities;

public class Persona {
    private int idPersona;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private String docIdentidad;
    private Ubicacion direccion;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public Ubicacion getDireccion() {
        return direccion;
    }

    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }
}
