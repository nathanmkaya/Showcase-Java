package dev.nathanmkaya.showcasejava.ui.ui.agency;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.inject.Inject;

import dev.nathanmkaya.showcasejava.R;
import dev.nathanmkaya.showcasejava.data.model.Agency;
import dev.nathanmkaya.showcasejava.di.Injectable;

public class agencyFragment extends Fragment implements Injectable {

    @Inject
    agencyViewModel agencyViewModel;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_agency, container, false);
        recyclerView = root.findViewById(R.id.agency_list);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        agencyViewModel.getAgencies();

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        agencyViewModel.agencyMutableLiveData.observe(this, new Observer<ArrayList<Agency>>() {
            @Override
            public void onChanged(ArrayList<Agency> agencies) {
                mAdapter = new AgencyAdapter(agencies);
                mAdapter.notifyDataSetChanged();
                recyclerView.setAdapter(mAdapter);
            }
        });
    }
}