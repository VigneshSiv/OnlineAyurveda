package com.cg.oam.service;

import java.util.List;

import com.cg.oam.entities.User;
import com.cg.oam.exception.UserNotFoundException;

public interface IUserService {

	public User addUser(User User);
	public User updateUser(User User) throws UserNotFoundException;
	public User removeUser(int userId) throws UserNotFoundException;
	public List<User> showAllUsers();
	public boolean validateUser(int userid,String userName);
}
