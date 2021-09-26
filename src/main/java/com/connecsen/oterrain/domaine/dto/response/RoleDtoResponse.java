package com.connecsen.oterrain.domaine.dto.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class RoleDtoResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String libelle ;
	private List<UserDtoResponse> users = new ArrayList<UserDtoResponse>();
}
