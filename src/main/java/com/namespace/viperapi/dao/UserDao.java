package com.namespace.viperapi.dao;

import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.User;

public interface UserDao {
	int insertUser(UUID id, User user);
	
	default int insertUser(User user)
	{
		UUID id = UUID.randomUUID();
		return insertUser(id, user);
	}
	
	List<User> selectAllUsers();
	
	User selectUserById(UUID id);
	
	int updateUserById(UUID id, User updatedUser);
	
	int deleteUserById(UUID id);
}
