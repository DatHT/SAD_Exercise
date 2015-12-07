package com.cathl.icook.dao;

import java.util.List;

import com.cathl.icook.entity.News;

public interface NewsDAO {
	public List<News> getNewsByCategory(int categoryId);
	public List<News> getAllNews();
	public News getNewsById(int newsId);
}
