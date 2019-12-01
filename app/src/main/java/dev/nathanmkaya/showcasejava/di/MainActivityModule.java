package dev.nathanmkaya.showcasejava.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dev.nathanmkaya.showcasejava.ui.MainActivity;

@Module
public abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract MainActivity contributeMainActivity();
}
