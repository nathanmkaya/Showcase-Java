package dev.nathanmkaya.showcasejava.data.remote.response;

import com.google.gson.annotations.SerializedName;

public class Launch {

    @SerializedName("name")
    public String name;

    @SerializedName("windowstart")
    public String windowstart;

    @SerializedName("id")
    public int id;

    @SerializedName("windowend")
    public String windowend;

    @SerializedName("net")
    public String net;
}