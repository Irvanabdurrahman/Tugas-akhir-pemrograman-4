package com.tugas.akhir;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class User{
	private Integer id;
	
	@NotNull
	@NotEmpty
	@Size(min=1, max=15)
	private String username;
	
	@NotNull @NotEmpty
	@Size(min=3, max=255)
	private String nama;
	
	@NotNull @NotEmpty
	private String password;
	
	 public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password=password;
	}

}