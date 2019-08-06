package edu.pucp.perugo.di.components;


import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

import edu.pucp.perugo.di.modules.ApplicationModule;
import io.reactivex.Scheduler;
import retrofit2.Retrofit;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Retrofit exposeRetrofit();
    Context exposeContext();

    @Named("ui_thread")
    Scheduler uiThread();
    @Named("executor_thread") Scheduler executorThread();
}
