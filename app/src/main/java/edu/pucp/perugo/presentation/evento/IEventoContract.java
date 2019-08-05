package edu.pucp.perugo.presentation.evento;

import java.util.List;

import edu.pucp.perugo.data.entities.Evento;

public interface IEventoContract {
    interface IView{
        void showError(String errorMsg);
        void showProgressBar();
        void hideProgressBar();
        void getTodosEventosSuccess(List<Evento> eventoList);
        void gotToDetalleEvento(int idEvento);
    }
    interface IPresenter{
        void attachView(IView view);
        void detachView();
        boolean isViewAttached();
        void getTodosEventos();
    }
}
