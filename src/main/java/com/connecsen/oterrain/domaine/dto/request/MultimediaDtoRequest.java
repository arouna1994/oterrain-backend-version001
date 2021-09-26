package com.connecsen.oterrain.domaine.dto.request;

import lombok.Data;
@Data
public class MultimediaDtoRequest {
	private Long id;
	private String file ;
	public MultimediaDtoRequest() {
		super();
	}
	public MultimediaDtoRequest(String file) {
		super();
		this.file = file;
		
	}
	public MultimediaDtoRequest(Long id, String file) {
		super();
		this.id = id;
		this.file = file;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	

}
