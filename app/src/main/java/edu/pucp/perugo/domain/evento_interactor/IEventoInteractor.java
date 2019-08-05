package edu.pucp.perugo.domain.evento_interactor;

import java.util.List;

import edu.pucp.perugo.data.entities.Evento;
import io.reactivex.Observable;

public interface IEventoInteractor {
    Observable<List<Evento>> getTodosEventos();
}
