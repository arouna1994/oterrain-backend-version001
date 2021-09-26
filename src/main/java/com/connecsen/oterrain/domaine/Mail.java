package com.connecsen.oterrain.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Mail {
	private String email;
	private String name;
    private String subject;
    private String message;

}
