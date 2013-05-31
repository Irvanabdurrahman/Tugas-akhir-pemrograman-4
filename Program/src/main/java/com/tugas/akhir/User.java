package com.tugas.akhir;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class User{
	private Integer id;
	
	@NotNull
	@NotEmpty
	@Size(min=3, max=15)
	private String username;
	
	@NotNull @NotEmpty
	@Size(min=3, max=50)
	private String nama;
	
	@NotNull @NotEmpty
	private String password;
	
	@NotNull @NotEmpty
	private String email;
	
	private String avatar;
	/* private String background; */
	
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
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	
	
	 public String getAvatar(){
		return avatar;
	}
	
	public void setAvatar(String avatar){
		this.avatar=avatar;
	}
	
	
	/*public String getBackground(){
		return background;
	}
	
	public void setBackground(String background){
		this.background=background;
	}
 */
}