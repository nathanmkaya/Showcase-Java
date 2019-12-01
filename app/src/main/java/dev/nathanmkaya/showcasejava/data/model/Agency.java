package dev.nathanmkaya.showcasejava.data.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity
public class Agency {
    @SerializedName("islsp")
    public int islsp;
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
    @PrimaryKey(autoGenerate = true)
    long agency_id;
}