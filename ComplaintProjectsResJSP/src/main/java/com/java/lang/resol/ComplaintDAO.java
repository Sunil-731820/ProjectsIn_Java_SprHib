package com.java.lang.resol;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class ComplaintDAO {
	Connection connection;
	PreparedStatement pst;
	
	public int tat(Date cdate) {
		java.util.Date today = new java.util.Date();
		java.sql.Date td = new java.sql.Date(today.getTime());
		long ms = td.getTime()-cdate.getTime();
		 long m = ms/(1000*24*60*60);
		 int days = (int) m;
		 days = days+1;
		 return days;
	}

	
	
	public Complaint searchComplaint(String ComplaintId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from complaint where ComplaintId=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, ComplaintId);
		ResultSet res = pst.executeQuery();
		Complaint complaint = null;
		if(res.next()) {
			complaint = new Complaint();
			complaint.setComplaintId(res.getString("ComplaintId"));
			complaint.setComplaintType(res.getString("ComplaintType"));
			complaint.setcDsecription(res.getString("CDescription"));
			complaint.setComplaintDate(res.getDate("ComplaintDate"));
			complaint.setSeverity(res.getString("Severity"));
			complaint.setStatus(res.getString("Status"));
		}
		return complaint;
	}
	
	
	public Complaint[] showComplaint() throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Complaint> complaintList = new ArrayList<Complaint>();
		Complaint complaint = null;
		while(res.next()) {
			complaint = new Complaint();
			complaint.setComplaintId(res.getString("ComplaintId"));
			complaint.setComplaintType(res.getString("ComplaintType"));
			complaint.setcDsecription(res.getString("CDescription"));
			complaint.setComplaintDate(res.getDate("ComplaintDate"));
			complaint.setSeverity(res.getString("Severity"));
			complaint.setStatus(res.getString("Status"));
			complaintList.add(complaint);
		}
		return complaintList.toArray(new Complaint[complaintList.size()]);
		
	}

}
