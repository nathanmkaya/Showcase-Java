package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaunchesItem {

    @SerializedName("isostart")
    public String isostart;

    @SerializedName("isoend")
    public String isoend;

    @SerializedName("tbdtime")
    public int tbdtime;

    @SerializedName("rocket")
    public Rocket rocket;

    @SerializedName("windowstart")
    public String windowstart;

    @SerializedName("lsp")
    public Lsp lsp;

    @SerializedName("vidURL")
    public Object vidURL;

    @SerializedName("isonet")
    public String isonet;

    @SerializedName("inhold")
    public int inhold;

    @SerializedName("failreason")
    public String failreason;

    @SerializedName("netstamp")
    public int netstamp;

    @SerializedName("infoURL")
    public String infoURL;

    @SerializedName("tbddate")
    public int tbddate;

    @SerializedName("id")
    public int id;

    @SerializedName("net")
    public String net;

    @SerializedName("westamp")
    public int westamp;

    @SerializedName("hashtag")
    public String hashtag;

    @SerializedName("vidURLs")
    public List<String> vidURLs;

    @SerializedName("probability")
    public int probability;

    @SerializedName("infoURLs")
    public List<String> infoURLs;

    @SerializedName("wsstamp")
    public int wsstamp;

    @SerializedName("holdreason")
    public String holdreason;

    @SerializedName("missions")
    public List<MissionsItem> missions;

    @SerializedName("name")
    public String name;

    @SerializedName("location")
    public Location location;

    @SerializedName("windowend")
    public String windowend;

    @SerializedName("status")
    public int status;
}