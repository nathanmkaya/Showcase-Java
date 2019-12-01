package dev.nathanmkaya.showcasejava.ui.ui.agency;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dev.nathanmkaya.showcasejava.R;

public class AgenyViewHolder extends RecyclerView.ViewHolder {

    TextView agencyId;
    TextView agencyName;
    TextView agencyAbbv;
    TextView agencyCountry;

    public AgenyViewHolder(@NonNull View itemView) {
        super(itemView);
        agencyId = itemView.findViewById(R.id.agency_id);
        agencyName = itemView.findViewById(R.id.agency_name);
        agencyAbbv = itemView.findViewById(R.id.abbv_txt);
        agencyCountry = itemView.findViewById(R.id.country_txt);
    }
}
