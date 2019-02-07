package com.iEMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iEMS.model.Role;
import com.iEMS.model.User;
import com.iEMS.repositry.UserRepository;
import com.iEMS.repositry.RoleRepository;
import com.iEMS.service.UserService;

@Service
@Component
@ComponentScan({"com.iEMS.repositry"})
public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepository userRepositry;
	
	@Autowired
	private RoleRepository roleIemsRepository;
	
	public String successLoginform(User user) 
	{
		User users=new User();
		users.setName(user.getName());
		users.setEmail(user.getEmail());
		users.setMobile(user.getMobile());
		users.setPassword(user.getPassword());
		User users1=userRepositry.save(users);
			
		return "success";
	}

	@Override
	public String empLogin(User user) 
	{
		User u=userRepositry.findByEmail(user.getEmail());
		if(u==null)
			return "WRONG";
		else if((user.getEmail().equals(u.getEmail())) && (user.getPassword().equals(u.getPassword())))
		{
			Role r=roleIemsRepository.finduserByuserId(u.getId());
			String n=r.getName();
			return n;
		}
		else
		{
			return "Either UserID or PASSWORD is Wrong";
		}
	}
}
