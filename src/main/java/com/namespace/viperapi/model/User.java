package com.namespace.viperapi.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private final UUID userId;
	@NotBlank
	private final String name;
	@NotBlank
	private final String mailAddress;
	
	public User(@JsonProperty("id") UUID userId, @JsonProperty("username") String name, @JsonProperty("email") String mailAddress)
	{
		this.userId = userId;
		this.name = name;
		this.mailAddress = mailAddress;
	}
	
	public UUID getId()
	{
		return this.userId;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getMailAddress()
	{
		return this.mailAddress;
	}
}
