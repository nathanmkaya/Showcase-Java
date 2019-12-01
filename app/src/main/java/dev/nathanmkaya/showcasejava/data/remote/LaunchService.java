package dev.nathanmkaya.showcasejava.data.remote;

import dev.nathanmkaya.showcasejava.data.remote.response.Agencies;
import dev.nathanmkaya.showcasejava.data.remote.response.Launches;
import dev.nathanmkaya.showcasejava.data.remote.response.Missions;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LaunchService {

    @GET("agency")
    Observable<Agencies> getAgencies(@Query("mode") String mode, @Query("limit") long limit);

    @GET("launch")
    Observable<Launches> getLaunches(@Query("mode") String mode, @Query("limit") long limit);

    @GET("mission")
    Observable<Missions> getMissions(@Query("mode") String mode, @Query("limit") long limit);
}
