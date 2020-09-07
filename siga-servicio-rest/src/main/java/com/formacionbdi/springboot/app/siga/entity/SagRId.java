package com.formacionbdi.springboot.app.siga.entity;

import java.io.Serializable;


public class SagRId implements Serializable{
	

	private static final long serialVersionUID = -5904375214338781136L;
	
	private String COcodigo;
	private String CPcodigo;
	
	public SagRId() {
	}
	
	public SagRId(String COcodigo, String CPcodigo) {
		this.COcodigo = COcodigo;
		this.CPcodigo = CPcodigo;
	}
	
	public String getCOcodigo() {
		return COcodigo;
	}
	public void setCOcodigo(String cOcodigo) {
		COcodigo = cOcodigo;
	}
	public String getCPcodigo() {
		return CPcodigo;
	}
	public void setCPcodigo(String cPcodigo) {
		CPcodigo = cPcodigo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((COcodigo == null) ? 0 : COcodigo.hashCode());
		result = prime * result + ((CPcodigo == null) ? 0 : CPcodigo.hashCode());
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
		SagRId other = (SagRId) obj;
		if (COcodigo == null) {
			if (other.COcodigo != null)
				return false;
		} else if (!COcodigo.equals(other.COcodigo))
			return false;
		if (CPcodigo == null) {
			if (other.CPcodigo != null)
				return false;
		} else if (!CPcodigo.equals(other.CPcodigo))
			return false;
		return true;
	}
	
	

}
