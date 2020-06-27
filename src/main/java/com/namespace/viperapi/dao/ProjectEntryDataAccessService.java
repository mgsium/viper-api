package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.ProjectEntry;

public class ProjectEntryDataAccessService implements ProjectEntryDao {

	@Override
	public int insertProjectEntry(UUID id, ProjectEntry projectEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProjectEntry> selectAllProjectEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectEntry selectProjectEntryById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateProjectEntryById(UUID id, ProjectEntry updatedProjectEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProjectEntryById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
