package com.squadpair.java.model;

import java.util.List;

public class User {
	
	private String first;
	private String last;
	private String username;
	private List<String> gamesPlayed;
	
	User(String first, String last, String username, List<String> gamesPlayed) {
		this.first = first;
		this.last = last;
		this.username = username;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(List<String> gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	@Override
	public String toString() {
		return "User [first=" + first + ", last=" + last + ", username=" + username + ", gamesPlayed=" + gamesPlayed
				+ "]";
	}
	
}
