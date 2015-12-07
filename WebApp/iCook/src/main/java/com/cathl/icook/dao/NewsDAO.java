package com.cathl.icook.dao;

import java.util.List;

import com.cathl.icook.entity.News;

public interface NewsDAO {
	public List<News> getNewsByCategory(int categoryId);
	
	public News getNewsById(int newsId);
}
