package net.codejava.service;

import java.util.List;

import net.codejava.entity.User;

public interface UserService {


	void ajouterAdmin(net.codejava.entity.User user);

	List<User> RetrieveUsers();

	void ajouterClient(User user);

	void ajouterAgent(User user);

	String login(User use);


}
