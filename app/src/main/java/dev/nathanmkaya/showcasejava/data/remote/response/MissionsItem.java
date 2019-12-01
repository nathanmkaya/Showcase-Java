package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MissionsItem {

    @SerializedName("infoURL")
    public String infoURL;

    @SerializedName("name")
    public String name;

    @SerializedName("wikiURL")
    public String wikiURL;

    @SerializedName("description")
    public String description;

    @SerializedName("infoURLs")
    public List<String> infoURLs;

    @SerializedName("agencies")
    public List<AgenciesItem> agencies;

    @SerializedName("launch")
    public Launch launch;

    @SerializedName("id")
    public int id;

    @SerializedName("type")
    public int type;

    @SerializedName("events")
    public Object events;

    @SerializedName("typeName")
    public String typeName;
}