package com.example.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=2, max=20)
	private String name;
	@Size(min=2, max=20)
	private String creator;
	@NotBlank
	private int currentVersion;
	@Column(updatable = false)
	//^ this applies only to the line directly after
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date createdAt;
	//I changed the pattern format here ^ to signify that there are different ways to gather the same data.
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date updatedAt;
	
	
	public Language() {
		
	}
	
	public Language(Long id, @Size(min = 2, max = 20) String name, @Size(min = 2, max = 20) String creator,
			@NotBlank int currentVersion, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getCurrentVersion() {
		return currentVersion;
	}
	public void setCurrentVersion(int currentVersion) {
		this.currentVersion = currentVersion;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}
