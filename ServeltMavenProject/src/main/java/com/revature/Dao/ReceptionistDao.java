package com.revature.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.entity.Receptionist;
public class ReceptionistDao {
	private Connection conn;
	public ReceptionistDao(Connection conn) {
		super();
		this.conn=conn;
				
	}

	public boolean addDetails(Receptionist receptionist) {
		boolean f= false;
		try {
			String sql="insert into RECEPTIONIST (R_NAME,R_ID,R_GENDER,R_DESIGINATION,R_DATE_OF_BIRTH,R_AGE,R_SHIFT_TIME,R_CONTACT_NUMBER,R_ADDRESS ) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1, receptionist.getName());
			ps.setInt(2,receptionist.getId());
			ps.setString(3, receptionist.getGender());
        	ps.setString(4, receptionist.getDesigination() );
			ps.setString(5, receptionist.getDateOfBirth());
			ps.setInt(6,receptionist.getAge());
			ps.setString(7,receptionist.getShiftTime());
			ps.setString(8,receptionist.getContactNumber());
			ps.setString(9,receptionist.getAddress());

			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		}catch( Exception e) {
			e.printStackTrace();
		}
		
		return f;

}
	public List<Receptionist> getAllReceptionist() 
	{
		List<Receptionist> list=new ArrayList<Receptionist>();
		Receptionist r=null;
		try {
			String sql="select * from receptionist";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{
				r=new Receptionist();
				r.setName(rs.getString(1));
				r.setId(rs.getInt(2));
				r.setGender(rs.getString(3));
				r.setDesigination(rs.getString(4));
				r.setDateOfBirth(rs.getString(5));
				r.setAge(rs.getInt(6));
				r.setShiftTime(rs.getString(7));
				r.setContactNumber(rs.getString(8));
				r.setAddress(rs.getString(9));
				list.add(r);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Receptionist getReceptionistById(int id) {
		Receptionist r=null;
		try {
			String sql="select * from receptionist where R_ID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())  
			{
				r=new Receptionist();
				r.setName(rs.getString(1));
				r.setId(rs.getInt(2));
				r.setGender(rs.getString(3));
				r.setDesigination(rs.getString(4));
				r.setDateOfBirth(rs.getString(5));
				r.setAge(rs.getInt(6));
				r.setShiftTime(rs.getString(7));
				r.setContactNumber(rs.getString(8));
				r.setAddress(rs.getString(9));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	
	}

	public boolean updateDetails(Receptionist receptionist) {
		boolean f= false;
		try {
			String sql="update  receptionist set R_NAME=?,R_ID=?,R_GENDER=?,R_DESIGINATION=?,R_DATE_OF_BIRTH=?,R_AGE=?,R_SHIFT_TIME=?,R_CONTACT_NUMBER=?,R_ADDRESS=? where R_ID=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1, receptionist.getName());
			ps.setInt(2,receptionist.getId());
			ps.setString(3, receptionist.getGender());
        	ps.setString(4, receptionist.getDesigination() );
			ps.setString(5, receptionist.getDateOfBirth());
			ps.setInt(6,receptionist.getAge());
			ps.setString(7,receptionist.getShiftTime());
			ps.setString(8,receptionist.getContactNumber());
			ps.setString(9,receptionist.getAddress());
			ps.setInt(10,receptionist.getId());

			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		}catch( Exception e) {
			e.printStackTrace();
		}
		
		return f;

}
	public boolean deleteReceptionist(int id) {
	boolean f=false;
	try {
		String sql="delete from receptionist where R_ID =  ? ";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		if(i==1) {
			f=true;
		}
		
	}catch( Exception e) {
		e.printStackTrace();
	}
	
	return f;
	}
}

