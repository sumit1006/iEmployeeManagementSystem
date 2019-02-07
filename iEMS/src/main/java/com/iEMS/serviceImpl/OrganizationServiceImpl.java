package com.iEMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iEMS.model.Organization;
import com.iEMS.repositry.OrganizationRepository;
import com.iEMS.service.OrganizationService;

@Service
@Component
@ComponentScan({"com.iEMS.repositry"})
public class OrganizationServiceImpl implements OrganizationService {

	
	@Autowired
	private OrganizationRepository organizationRepository;
	@Override
	public String registrationForm(Organization organization) {
		
		Organization organizations=new Organization();
		
		organizations.setId(organization.getId());
		organizations.setName(organization.getName());
		organizations.setStatus(organization.getStatus());
		organizations.setCreatedDate(organization.getCreatedDate());
		organizations.setUpdatedDate(organization.getUpdatedDate());
	
		organizationRepository.save(organizations);
		
		return "Registered";
	}

	
}
