package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.facebook.Entity.FacebookUser;

public class FacebookDAO  implements FacebookDAOInterface{

	int i;

		
	@Override
	public int createProfileDAO(FacebookUser fc)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
		
		PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		ps.setString(1, fc.getName());
		ps.setString(2, fc.getPassword());
		ps.setString(3,fc.getEmail());
		ps.setString(4,fc.getAddress());
		
		i=ps.executeUpdate();
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}


	public FacebookUser viewProfileDAO(FacebookUser fu) {
		// TODO Auto-generated method stub
		FacebookUser t=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
		
		PreparedStatement ps=con.prepareStatement("select * from facebookuser where email=?");
		
		ps.setString(1, fu.getEmail());
		
		ResultSet res=ps.executeQuery();
		
		if(res.next()) {
			String name=res.getString(1);
			String password=res.getString(2);
			String email=res.getString(3);
			String address=res.getString(4);
			
			t=new FacebookUser();
			t.setName(name);
			t.setPassword(password);
			t.setEmail(email);
			t.setAddress(address);
			
		}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return t;

	}


	@Override
	public List<FacebookUser> viewAllProfileDAO() {
		
		
		List<FacebookUser> ll=new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("select * from facebookuser");
			
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				FacebookUser fu=new FacebookUser();
				
				fu.setName(n);
				fu.setPassword(p);
				fu.setEmail(e);
				fu.setAddress(a);
				
				ll.add(fu);
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return ll;
	}


	@Override
	public FacebookUser searchProfileDAO(FacebookUser fu) {
		
		FacebookUser t=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("select * from facebookuser where Name=?");
			ps.setString(1,fu.getName());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				t=new FacebookUser();
				t.setName(n);
				t.setPassword(p);
				t.setEmail(e);
				t.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return t;
		// TODO Auto-generated method stub
		
	}


	public FacebookUser loginProfileDAO(FacebookUser fu) {
		// TODO Auto-generated method stub
		
		FacebookUser t=new FacebookUser();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("select * from facebookuser where name=?");
			ps.setString(1,fu.getName());
			//ps.setString(2, fu.getPassword());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				t.setName(n);
				t.setPassword(a);
				t.setEmail(e);
				t.setAddress(a);
				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return t;
	}


	@Override
	public int editProfileDAO(FacebookUser fu) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("update facebookuser set password=?,address=? where email=?");
			ps.setString(1, fu.getPassword());
			ps.setString(2, fu.getAddress());
			ps.setString(3,fu.getEmail());
			
			int i=ps.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
		return i;
	}


	public int deleteProfileDAO(FacebookUser fu) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("delete from facebookuser where name=?");
			
			ps.setString(1,fu.getName());
			
			
			int i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	
		return i;
	}
}
