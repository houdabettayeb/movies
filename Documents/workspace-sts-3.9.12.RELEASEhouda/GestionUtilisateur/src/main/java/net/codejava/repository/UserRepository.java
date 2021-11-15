package net.codejava.repository;

import org.springframework.data.repository.CrudRepository;

import net.codejava.entity.User;

public interface UserRepository extends CrudRepository<User , Long>
{
	

}
