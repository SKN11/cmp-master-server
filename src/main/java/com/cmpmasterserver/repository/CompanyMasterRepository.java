package com.cmpmasterserver.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cmpmasterserver.model.CompanyMaster;  
@Repository  
public interface CompanyMasterRepository extends JpaRepository<CompanyMaster, Integer>  
{  
  
	
	@Query("SELECT u FROM CompanyMaster u WHERE u.cmpCode = ?1")  //get cmp with id 40
	List<CompanyMaster> findAllActiveUsersByID(Integer cmpCode);
	
	@Query("SELECT u FROM CompanyMaster u")  //get all user
	List<CompanyMaster> findAllActiveUsers();
	
	@Query("SELECT u FROM CompanyMaster u")  //get all user
	Page<CompanyMaster> findAllActiveUsersPaginated(Pageable PagefirstPageWithTwoElements);
	
	
	
}  