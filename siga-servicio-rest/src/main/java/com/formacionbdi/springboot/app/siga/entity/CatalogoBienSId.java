package com.formacionbdi.springboot.app.siga.entity;

import java.io.Serializable;

public class CatalogoBienSId implements Serializable{

	private static final long serialVersionUID = -8882032868515077418L;
	
	private String var1;
	private String var2;
	private String var3;
	private String var4;
	private String var5;
	private String var6;
	
	public CatalogoBienSId() {
	}
	
	public CatalogoBienSId(String var1, String var2, String var3, String var4, String var5, String var6) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
		this.var4 = var4;
		this.var5 = var5;
		this.var6 = var6;
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
	public String getVar4() {
		return var4;
	}
	public void setVar4(String var4) {
		this.var4 = var4;
	}
	public String getVar5() {
		return var5;
	}
	public void setVar5(String var5) {
		this.var5 = var5;
	}
	public String getVar6() {
		return var6;
	}
	public void setVar6(String var6) {
		this.var6 = var6;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((var1 == null) ? 0 : var1.hashCode());
		result = prime * result + ((var2 == null) ? 0 : var2.hashCode());
		result = prime * result + ((var3 == null) ? 0 : var3.hashCode());
		result = prime * result + ((var4 == null) ? 0 : var4.hashCode());
		result = prime * result + ((var5 == null) ? 0 : var5.hashCode());
		result = prime * result + ((var6 == null) ? 0 : var6.hashCode());
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
		CatalogoBienSId other = (CatalogoBienSId) obj;
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
		if (var4 == null) {
			if (other.var4 != null)
				return false;
		} else if (!var4.equals(other.var4))
			return false;
		if (var5 == null) {
			if (other.var5 != null)
				return false;
		} else if (!var5.equals(other.var5))
			return false;
		if (var6 == null) {
			if (other.var6 != null)
				return false;
		} else if (!var6.equals(other.var6))
			return false;
		return true;
	}
	
	
	
}
