package com.ashokit.dto;

import java.util.Date;

public class Contact {
	
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	private Date createdDate;
	private Date updateddDate;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Integer contactId, String contactName, String contactEmail, Long contactNumber, Date createdDate,
			Date updateddDate) {
		super();
		this.contactId = contactId;
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
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactNumber=" + contactNumber + ", createdDate=" + createdDate + ", updateddDate=" + updateddDate
				+ "]";
	}
	
	
	

}
