package dev.nathanmkaya.showcasejava.ui.ui.past;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PastViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PastViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}