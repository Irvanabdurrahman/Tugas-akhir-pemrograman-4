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
public class TweetDao{

	@Autowired private DataSource dataSource;
	
	private String insertTweet = "insert into twet (teks) " + "values (?)";
    private String sqlTampilSemua = "select * from twet order by id_tweet DESC";
	private String tampilById = "select * from twet where id_tweet=?";
	private String hapusById = "delete from twet where id_tweet= ?"; 
	
	 public void simpan(Tweet t) throws Exception {
		Connection c = dataSource.getConnection();
        if (t.getId_tweet() == null) {
			PreparedStatement psInsert = c.prepareStatement(insertTweet);
            psInsert.setString(1, t.getTeks());
            psInsert.executeUpdate();
        }
		c.close();
    } 
	
	public List<Tweet> tampilSemua() throws Exception {
        List<Tweet> hasil = new ArrayList<Tweet>();
		Connection c = dataSource.getConnection();
		PreparedStatement psTampilSemua = c.prepareStatement(sqlTampilSemua);
        ResultSet rs = psTampilSemua.executeQuery();
        while(rs.next()){
			Tweet t = hasilTweet(rs);
			hasil.add(t);
		}
		c.close();
		return hasil;
	}
		
		public Tweet tampilById(Integer id_tweet) throws Exception{
			if(id_tweet == null){
				return null;
			}
			Connection c = dataSource.getConnection();
			PreparedStatement psTampilById = c.prepareStatement(tampilById);
			psTampilById.setInt(1, id_tweet);
			ResultSet rs = psTampilById.executeQuery();
			if(!rs.next()){
				return null;
			}
			Tweet t = hasilTweet(rs);
			c.close();
			return t;
		} 
	
private Tweet hasilTweet(ResultSet rs) throws SQLException{
		    Tweet t = new Tweet();
			t.setId_tweet(rs.getInt("id_tweet"));
            t.setTeks(rs.getString("teks"));
            return t;
		}
		
	public void hapus(Integer id_tweet) throws Exception{
			if(id_tweet == null){
				return;
			}
			Connection c = dataSource.getConnection();
			PreparedStatement psHapusById = c.prepareStatement(hapusById);
			psHapusById.setInt(1, id_tweet);
			psHapusById.executeUpdate();
			c.close();
		} 
}
