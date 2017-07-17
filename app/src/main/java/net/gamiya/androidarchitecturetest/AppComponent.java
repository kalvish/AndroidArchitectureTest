package net.gamiya.androidarchitecturetest;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by kalan on 7/17/17.
 */

@Singleton
@Component(modules = AndroidInjectionModule.class)
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(BPApplication bpApp);
}
