package dev.nathanmkaya.showcasejava.di;

import android.app.Application;

import androidx.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.nathanmkaya.showcasejava.BuildConfig;
import dev.nathanmkaya.showcasejava.data.local.LaunchDb;
import dev.nathanmkaya.showcasejava.data.remote.LaunchService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
class AppModule {

    @Singleton
    @Provides
    LaunchService provideSpaceXService() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(LaunchService.class);
    }

    @Singleton
    @Provides
    LaunchDb provideDb(Application application) {
        return Room.
                databaseBuilder(application, LaunchDb.class, "spacex.db")
                .build();
    }

}
