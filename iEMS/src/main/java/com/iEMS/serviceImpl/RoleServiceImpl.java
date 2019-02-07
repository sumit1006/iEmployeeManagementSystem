package com.iEMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iEMS.model.Role;
import com.iEMS.model.User;
import com.iEMS.repositry.RoleRepository;
import com.iEMS.service.RoleService;

@Service
@Component
@ComponentScan({"com.iEMS.repositry"})
public class RoleServiceImpl implements RoleService {
	
	
	@Autowired
	private RoleRepository roleRepository;
	public void findRoleByUserId(User user) {
		
		Role role=roleRepository.finduserByuserId(user.getId());
		role.setName(role.getName());
		roleRepository.save(role);
		
		
	}

}
