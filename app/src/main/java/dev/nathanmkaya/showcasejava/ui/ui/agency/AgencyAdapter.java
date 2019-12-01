package dev.nathanmkaya.showcasejava.ui.ui.agency;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.nathanmkaya.showcasejava.R;
import dev.nathanmkaya.showcasejava.data.model.Agency;

public class AgencyAdapter extends RecyclerView.Adapter<AgenyViewHolder> {

    ArrayList<Agency> agencies;

    public AgencyAdapter(ArrayList<Agency> agencies) {
        this.agencies = agencies;
    }

    @NonNull
    @Override
    public AgenyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View agencyView = LayoutInflater.from(parent.getContext()).inflate(R.layout.agency_item, parent, false);
        AgenyViewHolder viewHolder = new AgenyViewHolder(agencyView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AgenyViewHolder holder, int position) {
        Agency agecy = agencies.get(position);

        holder.agencyId.setText(String.valueOf(agecy.id));
        holder.agencyName.setText(agecy.name);
        holder.agencyAbbv.setText(agecy.abbrev);
        holder.agencyCountry.setText(agecy.countryCode);
    }

    @Override
    public int getItemCount() {
        return agencies.size();
    }
}
