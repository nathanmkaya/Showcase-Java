package dev.nathanmkaya.showcasejava.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dev.nathanmkaya.showcasejava.Showcase;

@Singleton
@Component(modules = {
        ViewModelModule.class,
        MainActivityModule.class,
//        AppModule.class,
        AndroidInjectionModule.class
})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance Builder application(Application application);
        AppComponent build();
    }
    void inject(Showcase showcase);
}
