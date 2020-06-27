package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.Project;

public class ProjectDataAccessService implements ProjectDao {

	@Override
	public int insertProject(UUID id, Project project) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Project> selectAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project selectProjectById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateProjectById(UUID id, Project updatedProject) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProjectById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
