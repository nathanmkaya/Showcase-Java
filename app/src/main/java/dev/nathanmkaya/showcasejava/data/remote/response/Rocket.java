package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rocket {

    @SerializedName("imageSizes")
    public List<Integer> imageSizes;

    @SerializedName("configuration")
    public String configuration;

    @SerializedName("imageURL")
    public String imageURL;

    @SerializedName("name")
    public String name;

    @SerializedName("familyname")
    public String familyname;

    @SerializedName("wikiURL")
    public String wikiURL;

    @SerializedName("infoURLs")
    public List<String> infoURLs;

    @SerializedName("agencies")
    public List<AgenciesItem> agencies;

    @SerializedName("id")
    public int id;
}