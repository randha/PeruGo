package edu.pucp.perugo.di.modules;

import javax.inject.Named;

import dagger.Provides;
import edu.pucp.perugo.di.scope.PerActivity;
import edu.pucp.perugo.domain.detalle_evento_interactor.DetalleEventoInteractorImpl;
import edu.pucp.perugo.domain.detalle_evento_interactor.IDetalleEventoInteractor;
import edu.pucp.perugo.domain.evento_interactor.EventoInteractorImpl;
import edu.pucp.perugo.domain.evento_interactor.IEventoInteractor;
import edu.pucp.perugo.network.JsonPlaceHolderApi;
import io.reactivex.Scheduler;
import retrofit2.Retrofit;

public class PresentationModule {
    @PerActivity
    @Provides
    JsonPlaceHolderApi provideJsonPlaceHolderApi(Retrofit retrofit){
        return retrofit.create(JsonPlaceHolderApi.class);
    }

    @PerActivity
    @Provides
    IEventoInteractor provideMainInteractor(JsonPlaceHolderApi jsonPlaceHolderApi,
                                            @Named("ui_thread") Scheduler uiThread,
                                            @Named("executor_thread") Scheduler executorThread){
        return new EventoInteractorImpl(jsonPlaceHolderApi, uiThread, executorThread);
    }

    @PerActivity
    @Provides
    IDetalleEventoInteractor providePostDetailInteractor(JsonPlaceHolderApi jsonPlaceHolderApi,
                                                         @Named("ui_thread") Scheduler uiThread,
                                                         @Named("executor_thread") Scheduler executorThread){
        return new DetalleEventoInteractorImpl(jsonPlaceHolderApi,uiThread,executorThread);
    }
}
