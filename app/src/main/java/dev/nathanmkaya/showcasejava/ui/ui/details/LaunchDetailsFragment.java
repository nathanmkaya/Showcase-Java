package dev.nathanmkaya.showcasejava.ui.ui.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import dev.nathanmkaya.showcasejava.R;

public class LaunchDetailsFragment extends Fragment {

    private LaunchDetailsViewModel mViewModel;

    public static LaunchDetailsFragment newInstance() {
        return new LaunchDetailsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.launch_details_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LaunchDetailsViewModel.class);
        // TODO: Use the ViewModel
    }

}
