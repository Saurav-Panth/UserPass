package com.webwithserver.webtest1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserPass {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String userName;
	
	@Column
	private String password;
}
