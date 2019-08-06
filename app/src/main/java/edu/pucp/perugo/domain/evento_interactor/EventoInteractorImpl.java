package edu.pucp.perugo.domain.evento_interactor;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import edu.pucp.perugo.data.entities.Evento;
import edu.pucp.perugo.network.JsonPlaceHolderApi;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

@Singleton
public class EventoInteractorImpl implements IEventoInteractor {

    private final JsonPlaceHolderApi jsonPlaceHolderApi;
    private final Scheduler uiThread;
    private final Scheduler executorThread;

    @Inject
    public EventoInteractorImpl(JsonPlaceHolderApi jsonPlaceHolderApi, Scheduler uiThread, Scheduler executorThread) {
        this.jsonPlaceHolderApi = jsonPlaceHolderApi;
        this.uiThread = uiThread;
        this.executorThread = executorThread;
    }

    @Override
    public Observable<List<Evento>> getTodosEventos() {
        return null;
    }
}
