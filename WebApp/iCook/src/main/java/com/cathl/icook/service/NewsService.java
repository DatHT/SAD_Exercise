package com.cathl.icook.service;

import java.util.List;

import com.cathl.icook.entity.News;

public interface NewsService {
	public List<News> getNewsByCategory(int categoryId);
	public List<News> getAllNews();
	public News getNewsById(int newsId);
}
