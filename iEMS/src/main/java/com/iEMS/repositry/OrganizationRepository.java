package com.iEMS.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iEMS.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

	
}
