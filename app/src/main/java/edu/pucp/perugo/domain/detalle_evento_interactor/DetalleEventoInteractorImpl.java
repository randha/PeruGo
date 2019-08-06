package edu.pucp.perugo.domain.detalle_evento_interactor;

import org.w3c.dom.Comment;

import java.util.List;

import javax.inject.Inject;

import edu.pucp.perugo.data.entities.Comentario;
import edu.pucp.perugo.data.entities.DetalleEvento;
import edu.pucp.perugo.data.entities.Evento;
import edu.pucp.perugo.network.JsonPlaceHolderApi;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;

public class DetalleEventoInteractorImpl implements IDetalleEventoInteractor {

    private final JsonPlaceHolderApi jsonPlaceHolderApi;
    private final Scheduler uiThread;
    private final Scheduler executorThread;

    @Inject
    public DetalleEventoInteractorImpl(JsonPlaceHolderApi jsonPlaceHolderApi, Scheduler uiThread, Scheduler executorThread) {
        this.jsonPlaceHolderApi = jsonPlaceHolderApi;
        this.uiThread = uiThread;
        this.executorThread = executorThread;
    }

    @Override
    public Observable<DetalleEvento> getDetalleEvento(int idEvento) {
        return Observable.zip(jsonPlaceHolderApi.getEvento(idEvento), jsonPlaceHolderApi.getComentarios(idEvento),
                new BiFunction<Evento, List<Comentario>, DetalleEvento>() {
                    @Override
                    public DetalleEvento apply(Evento evento, List<Comentario> comentarioList) throws Exception {
                        return new DetalleEvento(evento, comentarioList);
                    }
                }
        ).observeOn(uiThread)
                .subscribeOn(executorThread);
    }
}
