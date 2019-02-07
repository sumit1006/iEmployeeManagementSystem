package com.iEMS.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iEMS.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	@Query(value="select * from `role` where role_id=:role_id",nativeQuery=true)
	
	Role finduserByuserId(@Param("role_id") Integer role_id);
	
		
	
}
