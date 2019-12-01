package dev.nathanmkaya.showcasejava.data.model;

import com.google.gson.annotations.SerializedName;


public class Headquarters{

	@SerializedName("address")
	private String address;

	@SerializedName("city")
	private String city;

	@SerializedName("state")
	private String state;
}