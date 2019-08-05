package edu.pucp.perugo.data.entities;

import java.util.List;

public class Cliente extends Persona {
    private List<Evento> listaEventosRegistrados;
    private List<Evento> listaEventosVisualizados;

    public List<Evento> getListaEventosRegistrados() {
        return listaEventosRegistrados;
    }

    public void setListaEventosRegistrados(List<Evento> listaEventosRegistrados) {
        this.listaEventosRegistrados = listaEventosRegistrados;
    }

    public List<Evento> getListaEventosVisualizados() {
        return listaEventosVisualizados;
    }

    public void setListaEventosVisualizados(List<Evento> listaEventosVisualizados) {
        this.listaEventosVisualizados = listaEventosVisualizados;
    }
}
