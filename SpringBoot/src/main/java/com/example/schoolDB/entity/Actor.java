package com.example.schoolDB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {
	@Id
	private int id;
	private String name;
	private int totMovies;
	private String bestMovie;
	private String instaId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotMovies() {
		return totMovies;
	}
	public void setTotMovies(int totMovies) {
		this.totMovies = totMovies;
	}
	
	public String getBestMovie() {
		return bestMovie;
	}
	public void setBestMovie(String bestMovie) {
		this.bestMovie = bestMovie;
	}
	
	public String getInstaId() {
		return instaId;
	}
	public void setInstaId(String instaId) {
		this.instaId = instaId;
	}
	
	@Override
	public String toString() {
		return "Actor[id: "+id+", name: "+name+", Total Movies: "+totMovies+", Best Movie: "+bestMovie
				+", InstaId: "+instaId+"]";
	}
}
