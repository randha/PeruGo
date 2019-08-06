package edu.pucp.perugo.presentation.evento.presenter;

import javax.inject.Inject;

import edu.pucp.perugo.domain.evento_interactor.IEventoInteractor;
import edu.pucp.perugo.presentation.evento.IEventoContract;
import io.reactivex.disposables.Disposable;

public class EventoPresenter implements IEventoContract.IPresenter {
    IEventoContract.IView view;
    Disposable disposable;

    @Inject
    protected IEventoInteractor eventoInteractor;

    @Inject
    public EventoPresenter() {
    }

    @Override
    public void attachView(IEventoContract.IView view) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public boolean isViewAttached() {
        return false;
    }

    @Override
    public void getTodosEventos() {

    }
}
