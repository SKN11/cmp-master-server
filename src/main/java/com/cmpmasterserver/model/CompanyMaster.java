package com.cmpmasterserver.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;  

@Entity
@Table(name="T_MST_COMPANY")
public class CompanyMaster   
{  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CMP_Code")
	@NotNull
	private Integer cmpCode;
	
	
	@Column(name="CMP_CodeHRIS",unique=true)
	@NotNull
	private String cmpCodeHRIS;
	
	@Column(name="CMP_Name")
	private String cmpName; 
	
	@Column(name="CMP_AbbrName")
	private String cmpAbbrName; 
	
	@Column(name="CMP_RegNo")
	private String cmpregNo	;
	
	@Column(name="CMP_Logo")
	private String cmplogo;
	
	@Column(name="CMP_ActiveDate")
	private Date cmpActiveDate;
	
	@Column(name="CMP_isActive")
	@NotNull
	private boolean cmpIsActive;
	
	@Column(name="CMP_createdOn")
	@NotNull
	private Date cmpCreatedOn;
	
	@Column(name="CMP_createdBy")
	@NotNull
	private String cmpCreatedBy;
	
	@Column(name="CMP_lastModifiedOn")
	@NotNull
	private Date cmpLastModifiedOn;
	
	@Column(name="CMP_lastModifiedBy")
	@NotNull
	private String cmpLastModifiedBy;
	
	@Column(name="CMP_deactivatedBy")
	private String cmpDeactivatedBy;
	
	@Column(name="CMP_deactivatedOn")
	private Date cmpDeactivatedOn;
	
	@Column(name="CMP_reactivatedBy")
	private String cmpReactivatedBy;
	
	@Column(name="CMP_reactivatedOn")
	private Date cmpReactivatedOn;
	
	
	public CompanyMaster()   
	{  
		super();  
		
	}


	public CompanyMaster(@NotNull Integer cmpCode, @NotNull String cmpCodeHRIS, String cmpName, String cmpAbbrName,
			String cmpregNo, String cmplogo, Date cmpActiveDate, @NotNull boolean cmpIsActive,
			@NotNull Date cmpCreatedOn, @NotNull String cmpCreatedBy, @NotNull Date cmpLastModifiedOn,
			@NotNull String cmpLastModifiedBy, String cmpDeactivatedBy, Date cmpDeactivatedOn, String cmpReactivatedBy,
			Date cmpReactivatedOn) {
		super();
		this.cmpCode = cmpCode;
		this.cmpCodeHRIS = cmpCodeHRIS;
		this.cmpName = cmpName;
		this.cmpAbbrName = cmpAbbrName;
		this.cmpregNo = cmpregNo;
		this.cmplogo = cmplogo;
		this.cmpActiveDate = cmpActiveDate;
		this.cmpIsActive = cmpIsActive;
		this.cmpCreatedOn = cmpCreatedOn;
		this.cmpCreatedBy = cmpCreatedBy;
		this.cmpLastModifiedOn = cmpLastModifiedOn;
		this.cmpLastModifiedBy = cmpLastModifiedBy;
		this.cmpDeactivatedBy = cmpDeactivatedBy;
		this.cmpDeactivatedOn = cmpDeactivatedOn;
		this.cmpReactivatedBy = cmpReactivatedBy;
		this.cmpReactivatedOn = cmpReactivatedOn;
	}


	@Override
	public String toString() {
		return "CompanyMaster [cmpCode=" + cmpCode + ", cmpCodeHRIS=" + cmpCodeHRIS + ", cmpName=" + cmpName
				+ ", cmpAbbrName=" + cmpAbbrName + ", cmpregNo=" + cmpregNo + ", cmplogo=" + cmplogo
				+ ", cmpActiveDate=" + cmpActiveDate + ", cmpIsActive=" + cmpIsActive + ", cmpCreatedOn=" + cmpCreatedOn
				+ ", cmpCreatedBy=" + cmpCreatedBy + ", cmpLastModifiedOn=" + cmpLastModifiedOn + ", cmpLastModifiedBy="
				+ cmpLastModifiedBy + ", cmpDeactivatedBy=" + cmpDeactivatedBy + ", cmpDeactivatedOn="
				+ cmpDeactivatedOn + ", cmpReactivatedBy=" + cmpReactivatedBy + ", cmpReactivatedOn=" + cmpReactivatedOn
				+ "]";
	}


	public Integer getCmpCode() {
		return cmpCode;
	}


	public void setCmpCode(Integer cmpCode) {
		this.cmpCode = cmpCode;
	}


	public String getCmpCodeHRIS() {
		return cmpCodeHRIS;
	}


	public void setCmpCodeHRIS(String cmpCodeHRIS) {
		this.cmpCodeHRIS = cmpCodeHRIS;
	}


	public String getCmpName() {
		return cmpName;
	}


	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}


	public String getCmpAbbrName() {
		return cmpAbbrName;
	}


	public void setCmpAbbrName(String cmpAbbrName) {
		this.cmpAbbrName = cmpAbbrName;
	}


	public String getCmpregNo() {
		return cmpregNo;
	}


	public void setCmpregNo(String cmpregNo) {
		this.cmpregNo = cmpregNo;
	}


	public String getCmplogo() {
		return cmplogo;
	}


	public void setCmplogo(String cmplogo) {
		this.cmplogo = cmplogo;
	}


	public Date getCmpActiveDate() {
		return cmpActiveDate;
	}


	public void setCmpActiveDate(Date cmpActiveDate) {
		this.cmpActiveDate = cmpActiveDate;
	}


	public boolean isCmpIsActive() {
		return cmpIsActive;
	}


	public void setCmpIsActive(boolean cmpIsActive) {
		this.cmpIsActive = cmpIsActive;
	}


	public Date getCmpCreatedOn() {
		return cmpCreatedOn;
	}


	public void setCmpCreatedOn(Date cmpCreatedOn) {
		this.cmpCreatedOn = cmpCreatedOn;
	}


	public String getCmpCreatedBy() {
		return cmpCreatedBy;
	}


	public void setCmpCreatedBy(String cmpCreatedBy) {
		this.cmpCreatedBy = cmpCreatedBy;
	}


	public Date getCmpLastModifiedOn() {
		return cmpLastModifiedOn;
	}


	public void setCmpLastModifiedOn(Date cmpLastModifiedOn) {
		this.cmpLastModifiedOn = cmpLastModifiedOn;
	}


	public String getCmpLastModifiedBy() {
		return cmpLastModifiedBy;
	}


	public void setCmpLastModifiedBy(String cmpLastModifiedBy) {
		this.cmpLastModifiedBy = cmpLastModifiedBy;
	}


	public String getCmpDeactivatedBy() {
		return cmpDeactivatedBy;
	}


	public void setCmpDeactivatedBy(String cmpDeactivatedBy) {
		this.cmpDeactivatedBy = cmpDeactivatedBy;
	}


	public Date getCmpDeactivatedOn() {
		return cmpDeactivatedOn;
	}


	public void setCmpDeactivatedOn(Date cmpDeactivatedOn) {
		this.cmpDeactivatedOn = cmpDeactivatedOn;
	}


	public String getCmpReactivatedBy() {
		return cmpReactivatedBy;
	}


	public void setCmpReactivatedBy(String cmpReactivatedBy) {
		this.cmpReactivatedBy = cmpReactivatedBy;
	}


	public Date getCmpReactivatedOn() {
		return cmpReactivatedOn;
	}


	public void setCmpReactivatedOn(Date cmpReactivatedOn) {
		this.cmpReactivatedOn = cmpReactivatedOn;
	}

	
	
	
	
	
	
	
	
}  