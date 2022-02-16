package com.phase3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String city;
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
