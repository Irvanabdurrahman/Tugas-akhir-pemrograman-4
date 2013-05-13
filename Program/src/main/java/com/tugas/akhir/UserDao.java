package com.tugas.akhir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao{

	@Autowired private DataSource dataSource;
	
	private String sqlInsert = "insert into test (username, nama, password) " + "values (?,?,?)";
    private String sqlUpdate = "update test set username=?, nama=?, password=?" + "where id = ?"; 
	/* private String sqlUpdate = "update test set username=?, nama=?, password=?" + "where username = ?"; */
    private String sqlCariSemuaUser = "select * from test order by username";
	private String sqlCariById = "select * from test where id=?";
	private String sqlHapusById = "delete from test where id = ?"; 
	
	/* private String sqlCariByUsername = "select * from test where username=?";
	private String sqlHapusByUsername = "delete from test where username = ?"; */
	
	 public void simpan(User u) throws Exception {
		Connection c = dataSource.getConnection();
		
        if (u.getId() == null) {
			PreparedStatement psInsert = c.prepareStatement(sqlInsert);
            psInsert.setString(1, u.getUsername());
            psInsert.setString(2, u.getNama());
            psInsert.setString(3, u.getPassword());

            psInsert.executeUpdate();
        } else {
			PreparedStatement psUpdate = c.prepareStatement(sqlUpdate);
         	psUpdate.setString(1, u.getUsername());
            psUpdate.setString(2, u.getNama());
            psUpdate.setString(3, u.getPassword());
            psUpdate.setString(4, u.getUsername());
			
            psUpdate.executeUpdate();
        }
		c.close();
    } 
	
	/*  public void simpan(User p) throws Exception {
		Connection c = dataSource.getConnection();
		
        if (p.getUsername() == null) {
			PreparedStatement psInsert = c.prepareStatement(sqlInsert);
            psInsert.setString(1, p.getUsername());
            psInsert.setString(2, p.getNama());
            psInsert.setString(3, p.getPassword());

            psInsert.executeUpdate();
        } else {
			PreparedStatement psUpdate = c.prepareStatement(sqlUpdate);
         	psUpdate.setString(1, p.getUsername());
            psUpdate.setString(2, p.getNama());
            psUpdate.setString(3, p.getPassword());
            psUpdate.setString(4, p.getUsername());
			
            psUpdate.executeUpdate();
        }
		c.close();
    } */
	
	 public List<User> cariSemuaProduk() throws Exception {
        List<User> hasil = new ArrayList<User>();
		
		Connection c = dataSource.getConnection();
		PreparedStatement psCariSemuaProduk = c.prepareStatement(sqlCariSemuaUser);
		
        ResultSet rs = psCariSemuaProduk.executeQuery();
        while(rs.next()){
			User u = konversiResultSetKeProduk(rs);
			hasil.add(u);
		}
		c.close();
		return hasil;
		}
		
		public User cariById(Integer id) throws Exception{
			if(id == null){
				return null;
			}
			Connection c = dataSource.getConnection();
			PreparedStatement psCariById = c.prepareStatement(sqlCariById);
			psCariById.setInt(1, id);
			ResultSet rs = psCariById.executeQuery();
			if(!rs.next()){
				return null;
			}
			User u = konversiResultSetKeProduk(rs);
			c.close();
			return u;
		} 
		
		/* 	public User cariByUsername(String username) throws Exception{
			if(username == null){
				return null;
			}
			Connection c = dataSource.getConnection();
			PreparedStatement psCariByUsername = c.prepareStatement(sqlCariByUsername);
			psCariByUsername.setString(1, username);
			ResultSet rs = psCariByUsername.executeQuery();
			if(!rs.next()){
				return null;
			}
			User p = konversiResultSetKeProduk(rs);
			c.close();
			return p;
		} */
	
private User konversiResultSetKeProduk(ResultSet rs) throws SQLException{
		    User u = new User();
			u.setId(rs.getInt("id"));
            u.setUsername(rs.getString("username"));
            u.setNama(rs.getString("nama"));
            u.setPassword(rs.getString("password"));
            return u;
		}
		
		
	public void hapus(Integer id) throws Exception{
			if(id == null){
				return;
			}
			Connection c = dataSource.getConnection();
			PreparedStatement psHapusById = c.prepareStatement(sqlHapusById);
			psHapusById.setInt(1, id);
			psHapusById.executeUpdate();
			c.close();
		} 
		
		/* public void hapus(String username) throws Exception{
			if(username == null){
				return;
			}
			Connection c = dataSource.getConnection();
			PreparedStatement psHapusByUsername = c.prepareStatement(sqlHapusByUsername);
			psHapusByUsername.setString(1, username);
			psHapusByUsername.executeUpdate();
			c.close();
		} */
}
