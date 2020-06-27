package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.Template;

public class TemplateDataAccessService implements TemplateDao {

	@Override
	public int insertTemplate(UUID id, Template template) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Template> selectAllTemplates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Template selectTemplateById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTemplateById(UUID id, Template updatedTemplate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTemplateById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
