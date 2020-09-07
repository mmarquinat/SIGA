package com.formacionbdi.springboot.app.siga.entity;

import java.io.Serializable;

public class GrupoBienSId implements Serializable {

	private static final long serialVersionUID = 5447027202015584218L;
	
	private String BS_tipobien;
	private String BS_grupobien;
	
	public GrupoBienSId() {	
    }
	
	 public GrupoBienSId(String BS_tipobien, String BS_grupobien) {
	        this.BS_tipobien = BS_tipobien;
	        this.BS_grupobien = BS_grupobien;
	    }

	public String getBS_tipobien() {
		return BS_tipobien;
	}

	public void setBS_tipobien(String bS_tipobien) {
		BS_tipobien = bS_tipobien;
	}

	public String getBS_grupobien() {
		return BS_grupobien;
	}

	public void setBS_grupobien(String bS_grupobien) {
		BS_grupobien = bS_grupobien;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BS_grupobien == null) ? 0 : BS_grupobien.hashCode());
		result = prime * result + ((BS_tipobien == null) ? 0 : BS_tipobien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoBienSId other = (GrupoBienSId) obj;
		if (BS_grupobien == null) {
			if (other.BS_grupobien != null)
				return false;
		} else if (!BS_grupobien.equals(other.BS_grupobien))
			return false;
		if (BS_tipobien == null) {
			if (other.BS_tipobien != null)
				return false;
		} else if (!BS_tipobien.equals(other.BS_tipobien))
			return false;
		return true;
	}
	 
	
}
