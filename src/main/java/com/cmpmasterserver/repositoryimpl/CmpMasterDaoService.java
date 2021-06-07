package com.cmpmasterserver.repositoryimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cmpmasterserver.model.CompanyMaster;

@Component  
public class CmpMasterDaoService   
{  
	public static int usersCount=5;  
	//creating an instance of ArrayList  
	private static List<CompanyMaster> companyMasters=new ArrayList<>();  
	//static block   
	static  
	{  
		//adding cmp to the list  
		companyMasters.add(new CompanyMaster(1,"PUB", "Express Analytics","EA","EA001","path", new Date(),true,new Date(),"CEO",new Date(),"CEO","CEO",new Date(),"CEO",new Date()));
		companyMasters.add(new CompanyMaster(2,"SUB", "IBM","IB","IBM001","ibm_path", new Date(),true,new Date(),"CTO",new Date(),"CTO","CTO",new Date(),"CTO",new Date()));
		
	}  
	//method that retrieve all cmp from the list  
	public List<CompanyMaster> findAll()  
	{  
		return companyMasters;  
	}  
	//method that add the cmp in the list   
	public CompanyMaster save(CompanyMaster cmp)  
	{  
		if(cmp.getCmpCode()==null)  
		{  
			//increments the cmp id  
			cmp.setCmpCode(++usersCount);  
		}  
		companyMasters.add(cmp);  
		return cmp;  
	}  
	//method that find a particular cmp from the list  
	public CompanyMaster findOne(int id)  
	{  
		
		for(CompanyMaster cmp:companyMasters)  
		{  
			if(cmp.getCmpCode()==id)  
				return cmp;  
		}  
		return null;  
	} 
	
	
	public CompanyMaster deleteById(int id)  
	{  
		Iterator<CompanyMaster> iterator = companyMasters.iterator();  
		while(iterator.hasNext())  
		{  
			CompanyMaster cmp=iterator.next();  
			if(cmp.getCmpCode()==id)  
			{  
				iterator.remove();  
				return cmp; //returns the deleted resource back  
			}  
		}  
		return null;  
	} 
}  