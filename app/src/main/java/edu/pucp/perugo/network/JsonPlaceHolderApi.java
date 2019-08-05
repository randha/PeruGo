package edu.pucp.perugo.network;

import java.util.List;

import edu.pucp.perugo.data.entities.Comentario;
import edu.pucp.perugo.data.entities.Evento;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("eventos")
    Observable<List<Evento>> getEventosRx(); // el va a hacer el onNext

    @GET("eventos/{id}")
    Observable<Evento> getEvento(@Path("id") int idEvento);

    @GET("evento/{id}/comentario")
    Observable<List<Comentario>> getComentarios(@Path("id") int idEvento);
}
