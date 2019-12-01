package dev.nathanmkaya.showcasejava.ui.ui.agency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

import dev.nathanmkaya.showcasejava.data.mapper.AgencyMapper;
import dev.nathanmkaya.showcasejava.data.model.Agency;
import dev.nathanmkaya.showcasejava.data.remote.response.Agencies;
import dev.nathanmkaya.showcasejava.data.remote.response.AgenciesItem;
import dev.nathanmkaya.showcasejava.repo.LaunchRepo;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

public class agencyViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public MutableLiveData<ArrayList<Agency>> agencyMutableLiveData;
    private LaunchRepo launchRepo;

    @Inject
    public agencyViewModel(LaunchRepo launchRepo) {
        this.launchRepo = launchRepo;
    }

    public agencyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public void getAgencies() {
        agencyMutableLiveData = new MutableLiveData<>();
        launchRepo.getAgencies()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new Observer<Agencies>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Agencies agencies) {
                        ArrayList<Agency> data = new ArrayList();
                        for (AgenciesItem agenciesItem : agencies.agencies) {
                            Agency mappered = AgencyMapper.Instance.responseToModel(agenciesItem);
                            data.add(mappered);
                        }
                        agencyMutableLiveData.postValue(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Timber.e(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public LiveData<String> getText() {
        return mText;
    }
}