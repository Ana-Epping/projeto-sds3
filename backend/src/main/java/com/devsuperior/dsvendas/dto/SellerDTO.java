package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	public SellerDTO() {
	}

	public SellerDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SellerDTO(Seller entity) {
		super();
		this.id = entity.id;
		this.name = entity.name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
