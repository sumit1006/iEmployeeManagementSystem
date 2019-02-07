package com.iEMS.service;

import com.iEMS.model.User;
import com.iEMS.model.Role;

public interface UserService {
	
	public String successLoginform(User user);

	public String empLogin(User user);
}
