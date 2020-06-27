package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.Template;

public interface TemplateDao {
	int insertTemplate(UUID id, Template template);
	
	default int insertTemplate(Template template)
	{
		UUID id = UUID.randomUUID();
		return insertTemplate(id, template);
	}
	
	List<Template> selectAllTemplates();
	
	Template selectTemplateById(UUID id);
	
	int updateTemplateById(UUID id, Template updatedTemplate);
	
	int deleteTemplateById(UUID id);
}
