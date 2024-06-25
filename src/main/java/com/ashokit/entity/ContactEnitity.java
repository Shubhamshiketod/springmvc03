package com.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="CONTACT_DTLS")
public class ContactEnitity {
	@Id
	@Column(name="CONTACT_ID")
	@SequenceGenerator(
			          name="cid_se_gen",
			          sequenceName = "CONTACT_ID_SEQ",
			          allocationSize = 1						
			)
	
	@GeneratedValue(generator = "cid_se_gen",
	                 strategy = GenerationType.SEQUENCE                  
			)
	
	private Integer contactId;
	
	
	
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
	
	
	//created date and updated date will be inserted by framework
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updateddDate;

	public ContactEnitity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactEnitity( String contactName, String contactEmail, Long contactNumber,
			Date createdDate, Date updateddDate) {
		super();
		
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactNumber = contactNumber;
		this.createdDate = createdDate;
		this.updateddDate = updateddDate;
	}

	public Integer getContactId() {
		return contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getUpdateddDate() {
		return updateddDate;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdateddDate(Date updateddDate) {
		this.updateddDate = updateddDate;
	}

	@Override
	public String toString() {
		return "ContactEnitity [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail="
				+ contactEmail + ", contactNumber=" + contactNumber + ", createdDate=" + createdDate + ", updateddDate="
				+ updateddDate + "]";
	}
	
	
	
	
	
	
	
	

}
