package com.cathl.icook.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News implements Serializable {
	
	private static final long serialVersionUID = -7988799579036225137L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NewsID")
	private int newsid;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Highlight")
	private String highlight;
	
	@Column(name = "FullContent")
	private String fullContent;
	
	@Column(name = "CategoryID")
	private int categoryId;

	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHighlight() {
		return highlight;
	}

	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}

	public String getFullContent() {
		return fullContent;
	}

	public void setFullContent(String fullContent) {
		this.fullContent = fullContent;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
