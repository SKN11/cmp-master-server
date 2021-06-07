package com.cmpmasterserver.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cmpmasterserver.exception.CompanyNotFoundException;
import com.cmpmasterserver.model.CompanyMaster;
import com.cmpmasterserver.repository.CompanyMasterRepository;  


@RestController
@CrossOrigin
@RequestMapping("/api")
public class CustMasterController {

	@Autowired  
	private CompanyMasterRepository cmpMasterRepository; 
	
	
	@GetMapping("/cmpmasters")  
	public List<CompanyMaster> retriveAllMaster()  
	{  
		return cmpMasterRepository.findAll();
	} 
	
	@GetMapping("/cmpmasters/paginate")  
	public Page<CompanyMaster> retriveAllMasterPaginated()  
	{
		Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
		return cmpMasterRepository.findAll(firstPageWithTwoElements);
	} 
	
	

	@GetMapping("/jpa/users/{id}")  
	public CompanyMaster retriveMaster(@PathVariable int id)  
	{  
		Optional<CompanyMaster> cmpMaster= cmpMasterRepository.findById(id);  
		if(!cmpMaster.isPresent())  
			throw new CompanyNotFoundException("id: "+ id);  
		  
		return cmpMaster.get();  
	}  
	
	
 
	
	@PostMapping("/cmpmasters")  
	public ResponseEntity<Object> createMasterWithStatus(@RequestBody CompanyMaster user)  
	{ 
	CompanyMaster sevedUser=cmpMasterRepository.save(user);    
	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getCmpCode()).toUri();
	System.out.println(location);
	return ResponseEntity.created(location).build();  
	}
	
	
	@DeleteMapping("/cmpmasters/{id}")  
	public void deleteUser(@PathVariable int id)  
	{  
		cmpMasterRepository.deleteById(id);  
	} 
	

	//=====================
	@GetMapping("/cmpmasters40")  
	public List<CompanyMaster> findAllActiveUsersByID()  
	{  
		return cmpMasterRepository.findAllActiveUsersByID(40);
	}
	
	@GetMapping("/cmpmastersAll")  
	public List<CompanyMaster> findAllActiveUsers()  
	{ 
		//cmpMasterRepository
		return cmpMasterRepository.findAllActiveUsers();
	} 
	
	@GetMapping("/cmpmastersAll/paginate")  
	public Page<CompanyMaster> findAllActiveUsersPaginated()  
	{ 
		//cmpMasterRepository
		Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
		return cmpMasterRepository.findAllActiveUsersPaginated(firstPageWithTwoElements);
	} 
	
	
	
	
 
}  