package com.iEMS.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iEMS.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="select * from `user` where user_id=:user_id",nativeQuery=true)
	User finduserByuserId(@Param("user_id") Integer user_id);

	User findByEmail(String email);

	User findByPassword(int pass);


	
	
	

}
