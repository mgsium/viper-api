package com.namespace.viperapi.model;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Template {
	private UUID template_id;
	private String name;
	private String file_structure;
	private Date last_push_timestamp;
	private UUID user_id;
	
	
	public Template(
		@JsonProperty("template_id") UUID id,
		@JsonProperty("name") String name,
		@JsonProperty("file_structure") String file_structure,
		@JsonProperty("last_push_timestamp") Date timestamp,
		@JsonProperty("user_id") UUID user_id
	) 
	{
		this.template_id = id;
		this.name = name;
		this.file_structure = file_structure;
		this.last_push_timestamp = timestamp;
		this.user_id = user_id;
	}
	
	public UUID getTemplateId()
	{
		return this.template_id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getFileStructure()
	{
		return this.file_structure;
	}
	
	public Date getLastPushTimestamp()
	{
		return this.last_push_timestamp;
	}
	
	public UUID getParentUserId()
	{
		return this.user_id;
	}
}
