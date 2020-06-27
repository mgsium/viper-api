package com.namespace.viperapi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.namespace.viperapi.model.User;

public class UserDataAccessService implements UserDao {
	
	private static List<User> DB = new ArrayList<>();

	@Override
	public int insertUser(UUID id, User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectUserById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserById(UUID id, User updatedUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUserById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
