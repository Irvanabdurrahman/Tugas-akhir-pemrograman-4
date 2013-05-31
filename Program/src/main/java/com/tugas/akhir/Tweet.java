package com.tugas.akhir;

public class Tweet{
	private Integer id_tweet;	
	private String teks;
		
	public Integer getId_tweet() {
        return id_tweet;
    }

    public void setId_tweet(Integer id_tweet) {
        this.id_tweet = id_tweet;
    }

	
	public String getTeks(){
		return teks;
	}
	
	public void setTeks(String teks){
		this.teks=teks;
	}
}