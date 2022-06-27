package com.learn.executor.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="USER_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class User {	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String gender;
}
