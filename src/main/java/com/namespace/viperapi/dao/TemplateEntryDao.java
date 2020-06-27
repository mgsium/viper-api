package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.TemplateEntry;

public interface TemplateEntryDao {
	int insertTemplateEntry(UUID id, TemplateEntry templateEntry);
	
	default int insertTemplateEntry(TemplateEntry templateEntry)
	{
		UUID id = UUID.randomUUID();
		return insertTemplateEntry(id, templateEntry);
	}
	
	List<TemplateEntry> selectAllTemplateEntries();
	
	TemplateEntry selectTemplateEntryById(UUID id);
	
	int updateTemplateEntryById(UUID id, TemplateEntry updatedTemplateEntry);
	
	int deleteTemplateEntryById(UUID id);
}
