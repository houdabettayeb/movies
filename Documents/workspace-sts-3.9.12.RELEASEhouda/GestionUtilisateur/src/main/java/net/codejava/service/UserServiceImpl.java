package net.codejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.entity.User;
import net.codejava.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void ajouterAdmin(User user) 
	{
		user.setRole("admin");
		userRepository.save(user);
		
	}
	
	@Override
	public void ajouterClient(User user) 
	{
		user.setRole("client");
		userRepository.save(user);
		
	}
	
	
	@Override
	public void ajouterAgent(User user) 
	{
		user.setRole("agent");
		userRepository.save(user);
		
	}
	
	@Override
	public List<User> RetrieveUsers() 
	{
		List<User> users = (List<User>) userRepository.findAll();
		return users ;
		
	}
	@Override
	public String login(User use)
	{
		
		boolean s=false ; 
		String r=null ; 
		List<User> users = RetrieveUsers() ;
		for (User user:users)
		{
			if (user.getUsername().equals(use.getUsername()))
			{
				if (user.getPassword().equals(use.getPassword()))
				{
					s=true ; 
					r=user.getRole(); 
					break;
					
				}
			}
			
		}
		
		if(s==false)  {
			return "wrong password";
		}
		else 
		return ("welcome "+ r); 
		
	}

	


	
	
	

}
