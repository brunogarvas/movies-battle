package br.com.letscode.moviesbattle.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Autoridade {
	
	@EmbeddedId
	private AutoridadePK autoridadePK;

	public AutoridadePK getAutoridadePK() {
		return autoridadePK;
	}

	public void setAutoridadePK(AutoridadePK autoridadePK) {
		this.autoridadePK = autoridadePK;
	}
	
}
