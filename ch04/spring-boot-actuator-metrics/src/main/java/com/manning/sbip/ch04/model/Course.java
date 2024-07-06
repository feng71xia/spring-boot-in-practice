package com.manning.sbip.ch04.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "COURSES")
@Data
public class Course {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "RATING")
	private int rating;

	@Column(name = "DESCRIPTION")
	private String description;
	
	
}
