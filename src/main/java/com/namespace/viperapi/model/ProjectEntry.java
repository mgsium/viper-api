package com.namespace.viperapi.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectEntry extends Entry {
	private UUID project_entry_id;
	private UUID project_id;
	
	public ProjectEntry (
			@JsonProperty("project_entry_id") UUID project_entry_id,
			@JsonProperty("project_id") UUID project_id,
			@JsonProperty("content") String content
	)
	{
		super(content);
		this.project_entry_id = project_entry_id;
		this.project_id = project_id;
	}
	
	public UUID getProjectEntryId()
	{
		return this.project_entry_id;
	}
	
	public UUID getParentProjectId()
	{
		return this.project_id;
	}
}
