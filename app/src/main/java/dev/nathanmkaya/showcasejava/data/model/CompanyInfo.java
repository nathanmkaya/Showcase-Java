package dev.nathanmkaya.showcasejava.data.model;

import com.google.gson.annotations.SerializedName;

public class CompanyInfo{

	@SerializedName("summary")
	private String summary;

	@SerializedName("coo")
	private String coo;

	@SerializedName("founder")
	private String founder;

	@SerializedName("founded")
	private int founded;

	@SerializedName("vehicles")
	private int vehicles;

	@SerializedName("ceo")
	private String ceo;

	@SerializedName("launch_sites")
	private int launchSites;

	@SerializedName("headquarters")
	private Headquarters headquarters;

	@SerializedName("valuation")
	private long valuation;

	@SerializedName("name")
	private String name;

	@SerializedName("links")
	private Links links;

	@SerializedName("employees")
	private int employees;

	@SerializedName("test_sites")
	private int testSites;

	@SerializedName("cto")
	private String cto;

	@SerializedName("cto_propulsion")
	private String ctoPropulsion;
}