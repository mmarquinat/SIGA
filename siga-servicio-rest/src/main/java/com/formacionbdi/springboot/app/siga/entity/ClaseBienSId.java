package com.formacionbdi.springboot.app.siga.entity;

import java.io.Serializable;

public class ClaseBienSId implements Serializable{

	private static final long serialVersionUID = 1068569619179599087L;
	
	private String var1;
	private String var2;
	private String var3;
	
	
	public ClaseBienSId() {	
    }
	
	
	public ClaseBienSId(String var1, String var2, String var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	public String getVar1() {
		return var1;
	}
	public void setVar1(String var1) {
		this.var1 = var1;
	}
	public String getVar2() {
		return var2;
	}
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	public String getVar3() {
		return var3;
	}
	public void setVar3(String var3) {
		this.var3 = var3;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((var1 == null) ? 0 : var1.hashCode());
		result = prime * result + ((var2 == null) ? 0 : var2.hashCode());
		result = prime * result + ((var3 == null) ? 0 : var3.hashCode());
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
		ClaseBienSId other = (ClaseBienSId) obj;
		if (var1 == null) {
			if (other.var1 != null)
				return false;
		} else if (!var1.equals(other.var1))
			return false;
		if (var2 == null) {
			if (other.var2 != null)
				return false;
		} else if (!var2.equals(other.var2))
			return false;
		if (var3 == null) {
			if (other.var3 != null)
				return false;
		} else if (!var3.equals(other.var3))
			return false;
		return true;
	}

	

}
