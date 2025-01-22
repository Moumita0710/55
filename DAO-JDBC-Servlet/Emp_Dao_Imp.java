package myPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emp_Dao_Imp implements DAOEmp {
//	public static final String saveEmp = "";
//	public static final String updateEmp;
//	public static final String deleteEmp;
//	public static final String getEmp;
//	public static final String getAllEmp;


	@Override
	public int saveEmployee(EmpPojo employee) throws SQLException,ClassNotFoundException
	{
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement("insert into emp(id,name,password,email,country)values (?,?,?,?,?)");
		ps.setString(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getPassword());
		ps.setString(4, employee.getEmail());
		ps.setString(5, employee.getCountry());
		status=ps.executeUpdate();
		return status;
		
	}


	@Override
	public int Emp_Update(EmpPojo employee) throws SQLException, ClassNotFoundException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement("update emp set id=?,name=?,passowrd=?,email=?,country=? where id=?");
		ps.setString(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getPassword());
		ps.setString(4, employee.getEmail());
		ps.setString(5, employee.getCountry());
		ps.setString(1, employee.getId());
		System.out.println(ps);
		status=ps.executeUpdate();
		return status;
	}


	@Override
	public int Emp_Delete(String id) throws SQLException, ClassNotFoundException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement("delete from emp where id=?");
		ps.setString(1, id);
		System.out.println(ps);
		status=ps.executeUpdate();
		return status;
	}




	@Override
	public List<EmpPojo> getAllData() throws SQLException, ClassNotFoundException {
		List<EmpPojo> pojoList=new ArrayList<>();
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement("select * from emp");
		System.out.println(ps);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			EmpPojo emp=new EmpPojo();
			emp.setId(rs.getString(1));
			emp.setName(rs.getString(2));
			emp.setPassword(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setCountry(rs.getString(5));
			pojoList.add(emp);
			
		}
		return pojoList;
			
	}


	@Override
	public EmpPojo getId(String id) throws SQLException, ClassNotFoundException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement("select * from emp where id=?");
		ps.setString(1, id);
		System.out.println(ps);
		ResultSet rs=ps.executeQuery();
		EmpPojo emp=new EmpPojo();
		while(rs.next()) {
			emp.setId(rs.getString(1));
			emp.setName(rs.getString(2));
			emp.setPassword(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setCountry(rs.getString(5));

		}
		return emp;
	}

}
