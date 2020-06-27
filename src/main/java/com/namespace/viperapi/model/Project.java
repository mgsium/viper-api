package com.namespace.viperapi.model;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Project extends Template {
	private UUID project_id;
	
	public Project(
		@JsonProperty("project_id") UUID id,
		@JsonProperty("template_id") UUID template_id,
		@JsonProperty("name") String name,
		@JsonProperty("file_structure") String file_structure,
		@JsonProperty("last_push_timestamp") Date timestamp,
		@JsonProperty("user_id") UUID user_id
	)
	{
		super(template_id, name, file_structure, timestamp, user_id);
		this.project_id = id;
	}
	
	private UUID getProjectId()
	{
		return this.project_id;
	}
}
