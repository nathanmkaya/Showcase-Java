package dev.nathanmkaya.showcasejava.repo;

import javax.inject.Inject;

import dev.nathanmkaya.showcasejava.data.remote.LaunchService;
import dev.nathanmkaya.showcasejava.data.remote.response.Agencies;
import io.reactivex.Observable;

public class LaunchRepo {
    LaunchService service;

    @Inject
    public LaunchRepo(LaunchService service) {
        this.service = service;
    }

    public Observable<Agencies> getAgencies() {
        return service.getAgencies("verbose", 1000);
    }
}
