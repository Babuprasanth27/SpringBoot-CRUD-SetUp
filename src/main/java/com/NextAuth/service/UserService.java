package com.NextAuth.service;

import java.util.List;

import com.NextAuth.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUsers();

	User getUsersById(Long id);

	boolean deleteUser(Long id);

	User updateUser(Long id, User user);

}
