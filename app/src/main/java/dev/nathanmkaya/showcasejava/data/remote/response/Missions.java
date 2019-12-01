package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Missions {

    @SerializedName("total")
    public int total;

    @SerializedName("offset")
    public int offset;

    @SerializedName("missions")
    public List<MissionsItem> missions;

    @SerializedName("count")
    public int count;
}