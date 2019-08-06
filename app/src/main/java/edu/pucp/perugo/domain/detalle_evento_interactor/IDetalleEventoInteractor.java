package edu.pucp.perugo.domain.detalle_evento_interactor;

import edu.pucp.perugo.data.entities.DetalleEvento;
import io.reactivex.Observable;

public interface IDetalleEventoInteractor {
    Observable<DetalleEvento> getDetalleEvento(int idEvento);
}
