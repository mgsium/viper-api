package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.Project;

public interface ProjectDao {
	int insertProject(UUID id, Project project);
	
	default int insertProject(Project project)
	{
		UUID id = UUID.randomUUID();
		return insertProject(id, project);
	}
	
	List<Project> selectAllProjects();
	
	Project selectProjectById(UUID id);
	
	int updateProjectById(UUID id, Project updatedProject);
	
	int deleteProjectById(UUID id);
}
