package com.cathl.icook.service;

import java.util.List;

import com.cathl.icook.entity.News;

public interface NewsService {
	public List<News> getNewsByCategory(int categoryId);
	
	public News getNewsById(int newsId);
}
