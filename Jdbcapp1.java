package com.ict.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcapp1 {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException{
		
		//step1 - register jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
		
		System.out.println("Conenction success");

		Statement st=con.createStatement();
		//st.executeUpdate("create table ictemployees(id int,name varchar(20),email varchar(20))");
		System.out.println("table creation success");
		
		//st.executeUpdate("insert into ictemployees values(101,'ICTEmp001','ict@ict.com')");
	//	st.executeUpdate("insert into ictemployees values(102,'ICTEmp001','ict@ict.com')");

		//st.executeUpdate("update  ictemployees set email='ictmail@ict.com' where id=103");

		//st.executeUpdate("delete from ictemployees where id=104");
		
		ResultSet rs=st.executeQuery("select * from ictemployees");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
		}
		

	}

}
