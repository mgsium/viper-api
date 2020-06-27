package com.namespace.viperapi.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemplateEntry extends Entry {
	private UUID template_entry_id;
	private UUID template_id;
	
	public TemplateEntry (
			@JsonProperty("template_entry_id") UUID template_entry_id,
			@JsonProperty("template_id") UUID template_id,
			@JsonProperty("content") String content
	)
	{
		super(content);
		this.template_entry_id = template_entry_id;
		this.template_id = template_id;
	}
	
	public UUID getTemplateEntryId()
	{
		return this.template_entry_id;
	}
	
	private UUID getParentTemplateId()
	{
		return this.template_id;
	}
}
