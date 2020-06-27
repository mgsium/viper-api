package com.namespace.viperapi.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
	private String content;
	
	public Entry(@JsonProperty("content") String content)
	{
		this.content = content;
	}
	
	private String getContent()
	{
		return this.content;
	}
	
	
}
