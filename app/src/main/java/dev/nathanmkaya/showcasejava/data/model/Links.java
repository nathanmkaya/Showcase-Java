package dev.nathanmkaya.showcasejava.data.model;

import com.google.gson.annotations.SerializedName;

public class Links{

	@SerializedName("website")
	private String website;

	@SerializedName("twitter")
	private String twitter;

	@SerializedName("flickr")
	private String flickr;

	@SerializedName("elon_twitter")
	private String elonTwitter;
}