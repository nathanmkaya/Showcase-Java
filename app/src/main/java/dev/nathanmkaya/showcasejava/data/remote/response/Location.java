package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Location {

    @SerializedName("pads")
    public List<PadsItem> pads;

    @SerializedName("infoURL")
    public String infoURL;

    @SerializedName("countryCode")
    public String countryCode;

    @SerializedName("name")
    public String name;

    @SerializedName("wikiURL")
    public String wikiURL;

    @SerializedName("id")
    public int id;
}