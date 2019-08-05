package edu.pucp.perugo.di.components;

import javax.inject.Singleton;

import dagger.Component;
import edu.pucp.perugo.di.modules.PresentationModule;
import edu.pucp.perugo.di.scope.PerActivity;

@PerActivity
@Component (modules = PresentationModule.class, dependencies = ApplicationComponent.class)
public interface PresentationComponent {
    /*void inject(EventoActivity eventoActivity);
    void inject(DetalleEventoActivity detalleEventoActivity);*/
}
