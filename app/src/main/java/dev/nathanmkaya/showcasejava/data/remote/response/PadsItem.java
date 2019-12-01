package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PadsItem {

    @SerializedName("infoURL")
    public String infoURL;

    @SerializedName("latitude")
    public double latitude;

    @SerializedName("name")
    public String name;

    @SerializedName("wikiURL")
    public String wikiURL;

    @SerializedName("mapURL")
    public String mapURL;

    @SerializedName("agencies")
    public List<AgenciesItem> agencies;

    @SerializedName("id")
    public int id;

    @SerializedName("longitude")
    public double longitude;
}