package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Tự tăng giá trị 
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="code") // Dùng columnDifinition để định nghĩa kiểu dữ liệu mong muốn trong 
	private String code;
	
	
	 @OneToMany(mappedBy = "category")
	 private List<NewEntity> news = new ArrayList<>();
	     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	

	
	
	
	
}
