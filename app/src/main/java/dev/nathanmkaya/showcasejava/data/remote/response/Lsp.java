package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Lsp {

    @SerializedName("infoURL")
    public String infoURL;

    @SerializedName("countryCode")
    public String countryCode;

    @SerializedName("name")
    public String name;

    @SerializedName("wikiURL")
    public String wikiURL;

    @SerializedName("infoURLs")
    public List<String> infoURLs;

    @SerializedName("id")
    public int id;

    @SerializedName("abbrev")
    public String abbrev;

    @SerializedName("type")
    public int type;
}