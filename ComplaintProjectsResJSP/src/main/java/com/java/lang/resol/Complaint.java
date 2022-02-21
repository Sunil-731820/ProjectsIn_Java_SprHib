package com.java.lang.resol;

import java.sql.Date;

public class Complaint {
	private String complaintId;
	private String complaintType;
	private String cDsecription;
	private Date complaintDate;
	private String severity;
	private String status;
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public String getcDsecription() {
		return cDsecription;
	}
	public void setcDsecription(String cDsecription) {
		this.cDsecription = cDsecription;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
