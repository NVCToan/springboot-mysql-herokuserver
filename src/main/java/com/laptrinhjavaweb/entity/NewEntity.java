package com.laptrinhjavaweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="new")
public class NewEntity extends BaseEntity {
	@Id // ID này sẽ có nhiệm vụ là sẽ đánh dấu là khoá chính, not null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Tự tăng giá trị 
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="thumbnail") // Dùng columnDifinition để định nghĩa kiểu dữ liệu mong muốn trong 
	private String thumbnail;
	
	@Column(name="shortdescription",columnDefinition="TEXT")
	private String shortDescription;
	
	@Column(name="content", columnDefinition="TEXT")
	private String content;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name= "category_id")
	 private CategoryEntity category;
	
	
	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	
}
