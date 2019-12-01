package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Launches {

    @SerializedName("total")
    public int total;

    @SerializedName("offset")
    public int offset;

    @SerializedName("count")
    public int count;

    @SerializedName("launches")
    public List<LaunchesItem> launches;
}