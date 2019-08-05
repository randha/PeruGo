package edu.pucp.perugo.data.entities;

import java.util.List;

public class DetalleEvento {
    private Evento evento;
    private List<Comentario> comentarios;

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public DetalleEvento(Evento evento, List<Comentario> comentarioList) {
        this.evento = evento;
        this.comentarios = comentarioList;
    }
}
