package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.ProjectEntry;

public interface ProjectEntryDao {
	int insertProjectEntry(UUID id, ProjectEntry projectEntry);
	
	default int insertProjectEntry(ProjectEntry projectEntry)
	{
		UUID id = UUID.randomUUID();
		return insertProjectEntry(id, projectEntry);
	}
	
	List<ProjectEntry> selectAllProjectEntries();
	
	ProjectEntry selectProjectEntryById(UUID id);
	
	int updateProjectEntryById(UUID id, ProjectEntry updatedProjectEntry);
	
	int deleteProjectEntryById(UUID id);
}
