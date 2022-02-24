package br.com.letscode.moviesbattle.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AutoridadePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5883983354109053125L;

	private String username;
	
	private String authority;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
		
}