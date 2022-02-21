package com.java.lang.resol;

import java.sql.Date;

public class Resolve {
	private String ComplaintId;
	private Date ComplaintDate;
	private Date resolveDate;
	private String resolveBy;
	private String comments;
	public String getComplaintId() {
		return ComplaintId;
	}
	public void setComplaintId(String complaintId) {
		ComplaintId = complaintId;
	}
	public Date getComplaintDate() {
		return ComplaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		ComplaintDate = complaintDate;
	}
	public Date getResolveDate() {
		return resolveDate;
	}
	public void setResolveDate(Date resolveDate) {
		this.resolveDate = resolveDate;
	}
	public String getResolveBy() {
		return resolveBy;
	}
	public void setResolveBy(String resolveBy) {
		this.resolveBy = resolveBy;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
